package com.example.matthew.solitaire

object GamePresenter {
    var view: GameView? = null

    fun setGameView(gameView: GameView) {
        view = gameView
    }

    fun onDeckTap() {
        GameModel.onDeckTap()
        view?.update(GameModel)
    }

    fun onWasteTap() {
        GameModel.onWasteTap()
        view?.update(GameModel)
    }

    fun onFoundationTap(foundationIndex: Int) {
        GameModel.onFoundationTap(foundationIndex)
        view?.update()
    }

    fun onTableauTap(tableauIndex: Int, cardIndex: Int){
        GameModel.onTableauTap(tableauIndex, cardIndex)
        view?.update()
    }
}