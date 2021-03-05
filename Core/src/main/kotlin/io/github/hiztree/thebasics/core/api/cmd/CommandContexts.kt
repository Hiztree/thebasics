package io.github.hiztree.thebasics.core.api.cmd

import com.google.common.collect.Lists
import com.google.common.reflect.TypeToken
import io.github.hiztree.thebasics.core.TheBasics
import io.github.hiztree.thebasics.core.api.BasicTime
import io.github.hiztree.thebasics.core.api.cmd.sender.CommandSender
import io.github.hiztree.thebasics.core.api.inventory.item.extra.EnchantType
import io.github.hiztree.thebasics.core.api.inventory.item.ItemType
import io.github.hiztree.thebasics.core.api.inventory.item.ItemTypes
import io.github.hiztree.thebasics.core.api.inventory.item.extra.PotionType
import io.github.hiztree.thebasics.core.api.user.User

object CommandContexts {

    fun registerJVMContexts() {
        TheBasics.registerCommandContext(object : CommandContext<Integer>(TypeToken.of(java.lang.Integer::class.java)) {
            override fun complete(input: String): Integer {
                return try {
                    Integer(input)
                } catch(e: Exception) {
                    throw CommandException("number")
                }
            }
        })

        TheBasics.registerCommandContext(object : CommandContext<java.lang.Double>(TypeToken.of(java.lang.Double::class.java)) {
            override fun complete(input: String): java.lang.Double {
                return try {
                    java.lang.Double(input)
                } catch(e: Exception) {
                    throw CommandException("number")
                }
            }
        })
    }

    fun registerKotlinContexts() {
        TheBasics.registerCommandContext(object : CommandContext<String>(TypeToken.of(String::class.java)) {
            override fun complete(input: String): String {
                return input
            }
        })

        TheBasics.registerCommandContext(object : CommandContext<Int>(TypeToken.of(Int::class.java)) {
            override fun complete(input: String): Int {
                return input.toIntOrNull() ?: throw CommandException("number")
            }
        })

        TheBasics.registerCommandContext(object : CommandContext<Double>(TypeToken.of(Double::class.java)) {
            override fun complete(input: String): Double {
                return input.toDoubleOrNull() ?: throw CommandException("number")
            }
        })

        TheBasics.registerCommandContext(object : CommandContext<Boolean>(TypeToken.of(Boolean::class.java)) {
            override fun complete(input: String): Boolean {
                return input.toBoolean()
            }
        })
    }

    fun registerBasicContexts() {
        TheBasics.registerCommandContext(object : CommandContext<User>(BasicTokens.USER_TOKEN) {
            override fun complete(input: String): User {
                return TheBasics.instance.getUser(input) ?: throw CommandException("user")
            }

            override fun tab(sender: CommandSender, last: String): List<String> {
                val senderUser: User? = if (sender is User) sender else null
                val matched = Lists.newArrayList<String>()

                for (user in TheBasics.instance.users) {
                    val name: String = user.getName()

                    if ((senderUser != null && user != senderUser) && user.getName().startsWith(last)) {
                        matched.add(name)
                    }
                }

                return matched
            }
        })

        TheBasics.registerCommandContext(object : CommandContext<ItemType>(BasicTokens.ITEM_TYPE_TOKEN) {
            override fun complete(input: String): ItemType {
                return ItemTypes.getByName(input) ?: throw CommandException("item type")
            }

            override fun tab(sender: CommandSender, last: String): List<String> {
                val matched = Lists.newArrayList<String>()

                for (item in ItemTypes.VALUES) {
                    if (item.name.startsWith(last)) {
                        matched.add(item.name)
                    }
                }

                return matched
            }
        })

        TheBasics.registerCommandContext(object : CommandContext<EnchantType>(BasicTokens.ENCHANT_TYPE_TOKEN) {
            override fun complete(input: String): EnchantType {
                return EnchantType.getByName(input) ?: throw CommandException("enchantment")
            }
        })

        TheBasics.registerCommandContext(object : CommandContext<PotionType>(BasicTokens.POTION_TYPE_TOKEN) {
            override fun complete(input: String): PotionType {
                return PotionType.getByName(input) ?: throw CommandException("enchantment")
            }
        })

        TheBasics.registerCommandContext(object : CommandContext<JoinedString>(BasicTokens.JOINED_STRING_TOKEN) {
            override fun complete(input: String): JoinedString {
                return JoinedString.empty
            }
        })

        TheBasics.registerCommandContext(object : CommandContext<BasicTime>(BasicTokens.TIME_TOKEN) {
            override fun complete(input: String): BasicTime {
                val duration = BasicTime.parseTime(input)

                if(duration.isZero())
                    throw CommandException("duration")

                return duration
            }
        })
    }
}