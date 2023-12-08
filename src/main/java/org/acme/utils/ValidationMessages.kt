package org.acme.utils

object ValidationMessages {
    const val REQUEST_BODY_MUST_NOT_BE_NULL = "o corpo da requisição não deve ser nulo"
    const val USERNAME_MUST_BE_NOT_BLANK = "o nome de usuário não deve estar em branco"
    const val CARD_USER_MUST_BE_NOT_BLANK = "o nome do titular não deve estar em branco"
    const val CARD_NUMBER_MUST_BE_NOT_BLANK = "o número do cartão não deve estar em branco"
    const val CARD_FLAG_MUST_BE_NOT_BLANK = "a bandeira do cartão não deve estar em branco"
    const val CARD_DUE_MUST_BE_NOT_BLANK = "a data de vencimento do cartão não deve estar em branco"
    const val EMAIL_MUST_BE_NOT_BLANK = "o email não deve estar em branco"
    const val PASSWORD_MUST_BE_NOT_BLANK = "a senha não deve estar em branco"
    const val CPF_MUST_NOT_BE_BLANK = "O campo CPF não pode ser nulo ou vazio"
    const val CPF_ALREADY_EXISTS = "O campo CPF já existe!"
    const val INVALID_CREDENTIALS = "Credenciais estão inválidas!"
    const val REQUIRED = "Este campo é obrigatório!"
}