package bj

import kotlinx.css.Display
import react.RBuilder
import react.dom.div
import react.dom.h1
import styled.css
import styled.styledDiv

fun RBuilder.gameUI(g: Game, eh: Eh) {
    div {
        h1 { +"Blackjack" }
        buttonBar(eh)
        styledDiv {
            css {
                display = Display.flex
                padding = "10px"
            }

            handUI(g.ph)

            handUI(g.dh)
        }

    }
}

