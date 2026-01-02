package com.example.myfirebase.repositori



interface ContainerApp {
    val repositoriSiswa: RepositorySiswa
}

class DefaultContainerApp : ContainerApp {
    override val repositoriSiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}



