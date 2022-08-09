package me.centauri07.dts

import me.centauri07.jarbapi.BotApplication
import me.centauri07.jarbapi.util.JsonAdapter
import net.dv8tion.jda.api.requests.GatewayIntent
import java.io.File
import java.util.*

/**
 * @author Centauri07
 */
class Application: BotApplication() {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            Application().enable()
        }

    }

    lateinit var applicationConfiguration: ApplicationConfiguration
        private set

    override fun onLoad() {
        configFolder = File(".")

        applicationConfiguration = JsonAdapter(ApplicationConfiguration::class.java, null, "application_config", configFolder).model!!

        setToken(applicationConfiguration.token)
        ofIntents(*GatewayIntent.values())
    }


    override fun onEnable() {

    }

}