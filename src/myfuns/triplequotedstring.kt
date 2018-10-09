package myfuns

/**
 * @author lanhuidong
 * @since 2018-10-09
 */
fun main(args: Array<String>) {

    val kotlinLogo = """| //
        .|//
        .|/ \"""
    println(kotlinLogo.trimMargin("."))

    // 因为3引号字符串支持字符串模版，但不支持转义字符，因此需要使用嵌套表达式
    val price = """${'$'}99.9"""
    println(price)
}