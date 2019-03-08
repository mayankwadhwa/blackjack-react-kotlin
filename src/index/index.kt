package index

import bj.*
import kotlinx.css.Display
import react.RBuilder
import react.dom.*
import styled.css
import styled.styledDiv
import kotlin.browser.*


val g = Game()

fun main(args: Array<String>) {
    val rootContainer = document.getElementById("root")
    render(rootContainer) {
        app()
    }
}

