package proxy.problem

object Client {

    @JvmStatic
    fun main(args: Array<String>){
        val library = Library()

        val fileNames = listOf("x.pdf","y.docs","z.txt")
        fileNames.forEach { library.add(EBook(it)) }

        library.openEbook("x.pdf")
    }
}