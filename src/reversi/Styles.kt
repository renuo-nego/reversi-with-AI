package reversi

import com.sun.prism.paint.Color
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val gridStyle by cssclass()
        val stackPaneStyle by cssclass()
        val cellStyle by cssclass()
        val black = Color.BLACK
    }

    init {
        stackPaneStyle {
           borderColor += box(fill)
        }
        gridStyle {
            padding = box(0.px)
        }
        cellStyle {
            padding = box(0.px)
        }
    }
}