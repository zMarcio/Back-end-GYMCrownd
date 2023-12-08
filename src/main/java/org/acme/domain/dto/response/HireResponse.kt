package org.acme.domain.dto.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName
import io.quarkus.runtime.annotations.RegisterForReflection
import org.acme.domain.model.Hire

@JsonRootName("hire")
@RegisterForReflection
data class HireResponse(
    @JsonProperty("result")
    val result: Any?,

    @JsonProperty("message")
    val message: String?,

    @JsonProperty("status")
    val status: Boolean,
) {
    companion object {
        @JvmStatic
        fun build(hire: Hire, message: String?, status: Boolean): HireResponse = HireResponse(
            result = hire,
            message = message,
            status = status
        )
    }
}
