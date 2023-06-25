package com.bangkit.jetpackcompose.model

object MoviesData {
    val movies = listOf(
        Movie(
            1,
            "The Last of Us",
            "Jan. 15, 2023",
            listOf(Genre.ActionAdventure, Genre.SciFi, Genre.Fantasy),
            8.7F,
            "\t\tTwenty years after modern civilization has been destroyed, Joel, a hardened survivor, is hired to smuggle Ellie, " +
                    "a 14-year-old girl, out of an oppressive quarantine zone. What starts as a small job soon becomes a brutal, " +
                    "heartbreaking journey, as they both must traverse the United States and depend on each other for survival.",
            "https://m.media-amazon.com/images/M/MV5BZGUzYTI3M2EtZmM0Yy00NGUyLWI4ODEtN2Q3ZGJlYzhhZjU3XkEyXkFqcGdeQXVyNTM0OTY1OQ@@._V1_FMjpg_UX1000_.jpg",
        ),
        Movie(
            2,
            "House of the Dragon",
            "Aug. 21, 2022",
            listOf(Genre.Adventure, Genre.Drama, Genre.SciFi, Genre.Fantasy),
            7.6F,
            "\t\tThe prequel series finds the Targaryen dynasty at the absolute apex of its power, with more than 15 dragons under their yoke." +
                    "Most empires—real and imagined—crumble from such heights. In the case of the Targaryens, their slow fall begins almost 193 years before the events of Game of Thrones, " +
                    "when King Viserys Targaryen breaks with a century of tradition by naming his daughter Rhaenyra heir to the Iron Throne. But when Viserys later fathers a son, the court is shocked when Rhaenyra retains her status as his heir, " +
                    "and seeds of division sow friction across the realm.",
            "https://m.media-amazon.com/images/M/MV5BZjBiOGIyY2YtOTA3OC00YzY1LThkYjktMGRkYTNhNTExY2I2XkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_FMjpg_UX1000_.jpg",
        ),
        Movie(
            3,
            "Westworld",
            "Oct. 02, 2016",
            listOf(Genre.Science, Genre.FictionWest, Genre.TVSeriWestern),
            8.0F,
            "\t\tA dark odyssey about the dawn of artificial consciousness and the evolution of sin. " +
                    "Set at the intersection of the near future and the reimagined past, " +
                    "it explores a world in which every human appetite, no matter how noble or depraved, can be indulged.",
            "https://m.media-amazon.com/images/M/MV5BZDg1OWRiMTktZDdiNy00NTZlLTg2Y2EtNWRiMTcxMGE5YTUxXkEyXkFqcGdeQXVyMTM2MDY0OTYx._V1_FMjpg_UX1000_.jpg",
        ),
        Movie(
            4,
            "We Own This City",
            "Apr. 25, 2022",
            listOf(Genre.Crime, Genre.Drama),
            7.9F,
            "\t\tPenegak hukum di kota tersebut memperjuangkan larangan narkoba dan penangkapan massal dengan mengorbankan berbagai bentuk pekerjaan polisi. " +
                    "Dalam serial buatan David Simon dan George Pelecanos ini, cerita akan fokus pada Sersan Wayne (Jon Brenthal), seorang polisi yang kasar dan nakal saat menjalankan tugasnya demi mendapatkan keuntungan untuk dirinya sendiri. " +
                    "Sersan Wayne merupakan kepala unit yang mengatasi pelarangan peredaran narkoba dan penangkapan massal terhadap warga.",
            "https://m.media-amazon.com/images/M/MV5BYjE3NzQ4NzctYThlYi00MmQ2LWIwOTktY2NlN2I1NGE5MTBhXkEyXkFqcGdeQXVyNTE1NjY5Mg@@._V1_FMjpg_UX1000_.jpg",
        ),
        Movie(
            5,
            "Barry",
            "Mar. 25, 2018",
            listOf(Genre.Comedy, Genre.Crime),
            8.2F,
            "\t\t‘Barry’ merupakan komedi suram yang dibintangi Bill Hader sebagai sosok pembunuh bayaran yang tertekan dari Midwest. Kesepian dan tidak puas dalam kehidupannya, " +
                    "ia enggan pergi ke Los Angeles melakukan pekerjaannya membunuh seorang aktor yang ambisius.",
            "https://m.media-amazon.com/images/M/MV5BNDY5NzNlMWItMmFiYy00NjU1LWFhYTAtOWNhYjI2NDViNTZmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX1000_.jpg",
        ),
        Movie(
            6,
            "Avatar: The Way of Water",
            "Dec. 14, 2022",
            listOf(Genre.Action, Genre.Adventure, Genre.SciFi),
            8.9F,
            "\t\tSixteen years after the Na'vi repelled the RDA invasion of Pandora,[a] Jake Sully lives as chief of the Omatikaya clan and raises a family with Neytiri, which includes sons Neteyam and Lo'ak, " +
                    "daughter Tuk, and adopted children Kiri (born from Grace Augustine's inert avatar) and Spider, the Pandora-born human son of the late Colonel Miles Quaritch. To the Na'vi's dismay, the RDA, led by their new leader Frances Ardmore, " +
                    "returns to colonize Pandora, as Earth is dying. " +
                    "Among the new arrivals are Recombinants—Na'vi avatars implanted with the memories of deceased human soldiers—with Quaritch's recombinant serving as the leader.",
            "https://m.media-amazon.com/images/M/MV5BYjhiNjBlODctY2ZiOC00YjVlLWFlNzAtNTVhNzM1YjI1NzMxXkEyXkFqcGdeQXVyMjQxNTE1MDA@._V1_FMjpg_UX1000_.jpg",
        ),
        Movie(
            7,
            "Lovecraft Country",
            "Aug. 16, 2020",
            listOf(Genre.Drama, Genre.Mystery, Genre.SciFi, Genre.Fantasy),
            8.2F,
            "\t\tMenceritakan tentang kisah petualangan Atticus Freeman (Jonathan Majors). Bersama sahabat masa kecilnya, Letitia (Jurnee Smollett) dan pamannya, George (Courtney B. Vance). " +
                    "Mereka bertualang bersama dalam suatu perjalanan darat dari Chicago sekitar 1950-an. Tujuannya untuk mencari keberadaan sang ayah, Montrose (Michael Kenneth Willliam). " +
                    "Pencarian dan penyelamatan mereka berubah menjadi perjuangan bertahan hidup dan mati mengatasi teror. Baik dari kulit putih Amerika yang rasis, hingga mahluk-mahluk jahat yang muncul dari lembaran buku karya H.P. Lovecraft.",
            "https://m.media-amazon.com/images/M/MV5BNDliM2ZhZWMtM2YwMy00NjAzLTk1YmEtODJmZDhhMTIxOGRmXkEyXkFqcGdeQXVyNTc4MjczMTM@._V1_FMjpg_UX1000_.jpg",
        ),
        Movie(
            8,
            "Chernobyl",
            "May. 06, 2019",
            //"Drama, West TV Seri",
            listOf(Genre.Drama, Genre.TVSeriWestern),
            8.8F,
            "\t\tChernobyl bercerita tentang perjuangan para manusia yang terjebak dalam kebocoran reaktor nuklir dekat Kota Pripyat, Ukraina, yang terjadi pada 1986 silam. Tragedi di Uni Soviet tersebut mengancam ratusan juta penduduk Eropa. " +
                    "Bencana nuklir ini terjadi di fasilitas nuklir Chernobyl. Ledakan yang disebabkan oleh nuklir tersebut mencapai level 7 dan melibatkan hingga 7 ton nuklir ke atmosfer. " +
                    "Bencana ini mengalahkan bom Hiroshima dan Nagasaki 1945 yang melibatkan masing-masing 2 ton nuklir ke atmosfer.",
            "https://m.media-amazon.com/images/M/MV5BNTdkN2QwMDItMDVhNS00ZjFiLWEzNTctMzY5ODQzYWNkMDllXkEyXkFqcGdeQXVyMTMzNDExODE5._V1_FMjpg_UX1000_.jpg",
        ),
        Movie(
            9,
            "Band of Brothers",
            "Sep. 09, 2001",
            listOf(Genre.Drama, Genre.WarPolitics),
            7.7F,
            "\t\tBand of Brothers adalah miniseri tentang perang dunia kedua. Menceritakan kisah persahabatan dan persaudaraan kompi E (Easy Company) dari batalyon kedua, resimen infanteri parasut 506 Amerika Serikat, " +
                    "divisi lintas udara 101. Diangkat dari buku sejarawan Stephen Amborse dengan judul yang sama.",
            "https://m.media-amazon.com/images/M/MV5BMTI3ODc2ODc0M15BMl5BanBnXkFtZTYwMjgzNjc3._V1_FMjpg_UX1000_.jpg",
        ),
        Movie(
            10,
            "Watchmen",
            "Oct. 20, 2019",
            listOf(Genre.ActionAdventure, Genre.Crime, Genre.Drama, Genre.SciFi),
            7.8F,
            "\t\tKelompok supremasi kulit putih bernama Seventh Kavalry menantang Departemen Kepolisian Tulsa, Oklahoma karena dianggap memunculkan ketidakadilan rasial. Mereka menyatakan perang kepada kaum minoritas dan " +
                    "polisi yang memberi perlindungan khusus bagi para korban ketidakadilan rasial. Pada malam Natal 2016, " +
                    "kelompok ini menyerang rumah 40 petugas polisi yang bekerja di Departemen Kepolisian Tulsa. Peristiwa ini kemudian disebut sebagai “Malam Putih”.",
            "https://m.media-amazon.com/images/M/MV5BY2IzNGNiODgtOWYzOS00OTI0LTgxZTUtOTA5OTQ5YmI3NGUzXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_FMjpg_UX1000_.jpg",
        ),
    )

    fun getIndexData(index: Int): Movie {
        return movies[index]
    }
}