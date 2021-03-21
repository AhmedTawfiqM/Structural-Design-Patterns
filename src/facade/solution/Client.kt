package facade.solution

object Client {

    @JvmStatic
    fun main(args: Array<String>) {
        val notificationService = NotificationService()
        notificationService.send("Hello from AtDev", "Egypt")
    }
}