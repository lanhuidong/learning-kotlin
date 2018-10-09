/**
 * @author lanhuidong
 * @since 2018-10-09
 */
package myfuns

/**
 * 扩展函数，注意：扩展函数不能访问private或者protected的成员
 */
fun String.lastChar(): Char = get(length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}