package com.genologics.statsapi.services

import akka.actor.Actor
import java.util.UUID

/**
 * RegistrationService.
 *
 * @author Cameron Fieber <cameron.fieber@genologics.com>
 */

class RegistrationService extends Actor {
    println("RegistrationService created")

    def receive = {
        case "Register" => self.reply(UUID.randomUUID.toString)
        case _ => self.reply("not register")
    }
}