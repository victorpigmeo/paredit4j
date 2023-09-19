package dev.pigmeo.paredit4j

open class ClojureClassLoader {
    companion object {
        init {
            bind()
        }

        @JvmStatic
        fun bind() {
            Thread.currentThread().setContextClassLoader(ClojureClassLoader::class.java.getClassLoader())
        }
    }
}
