package org.acme.domain.exception

import jakarta.ws.rs.WebApplicationException
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.acme.domain.dto.response.ErrorResponse
class EmailAlreadyExistsException : WebApplicationException(
    Response.status(Response.Status.BAD_REQUEST)
        .entity(ErrorResponse("Email ja está em uso"))
        .type(MediaType.APPLICATION_JSON)
        .build()
)