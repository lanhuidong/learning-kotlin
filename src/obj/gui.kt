package obj

/**
 * @author lanhuidong
 * @since 2018-10-09
 */
interface Clickable {

    fun click()

    /**
     * 类似于Java 8中接口的默认方法
     */
    fun showOff() = println("I'm clickable!")

}

interface Focusable {

    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {

    /**
     * 强制使用override修饰符
     */
    override fun click() = println("I was clicked")

    /**
     * 当实现的多个接口包含相同的方法时，必须在类中重新实现改方法
     */
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}

fun main(args: Array<String>) {
    val button = Button()
    button.click()
    button.setFocus(true)
    button.showOff()
}
