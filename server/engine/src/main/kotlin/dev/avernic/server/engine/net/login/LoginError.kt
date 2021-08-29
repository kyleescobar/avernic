package dev.avernic.server.engine.net.login

import dev.avernic.server.engine.net.StatusResponse

class LoginError(val status: StatusResponse) : RuntimeException()