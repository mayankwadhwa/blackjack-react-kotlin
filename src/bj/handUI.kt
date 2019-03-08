package bj

import kotlinx.css.em
import kotlinx.css.px
import kotlinx.css.rem
import react.RBuilder
import react.dom.b
import react.dom.div
import styled.css
import styled.styledDiv

public fun RBuilder.handUI(h: Hand) {
    styledDiv {
        css {
            width = 10.rem
            height = 10.rem
            padding = "10rem"
            marginTop = 1.rem
            marginRight = 1.rem
            background = "cyan"
        }
        div { b { +"${h.name} Hand" } }
        div {
            h.cards.forEach {
                div { +it.name }
            }
        }
        div { b { +"${h.points} Point" } }
    }
}
