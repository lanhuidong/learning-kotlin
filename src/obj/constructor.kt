package obj

/**
 * @author lanhuidong
 * @since 2018-10-10
 */
interface User {
    var email: String
    val nickname: String
        get() = email.substringBefore('@')
}