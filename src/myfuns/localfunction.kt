package myfuns

import java.lang.IllegalArgumentException

/**
 * @author lanhuidong
 * @since 2018-10-09
 */
class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Cannot save user $id: $fieldName is empty!")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {

    user.validateBeforeSave()

}

fun main(args: Array<String>) {
    println(saveUser(User(1, "", "")))
}
