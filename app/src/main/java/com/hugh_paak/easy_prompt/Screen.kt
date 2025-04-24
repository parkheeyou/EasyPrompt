package com.hugh_paak.easy_prompt

// 화면 경로 정의용
sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Home : Screen("home")
    object PromptInput : Screen("prompt_input")
    object PromptResult : Screen("prompt_result")
    object Settings: Screen("settings")
}