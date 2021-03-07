package com.alkalynx.moviecatalogue.utils

import com.alkalynx.moviecatalogue.R
import com.alkalynx.moviecatalogue.data.MovieEntity

object DataDummy {

    fun generateDummyMovie(): ArrayList<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                R.drawable.godzilla,
                "Godzilla: King of the Monsters",
                "Follows the heroic efforts of the crypto-zoological agency Monarch as its members face off against a battery of god-sized monsters, including the mighty Godzilla, who collides with Mothra, Rodan, and his ultimate nemesis, the three-headed King Ghidorah. When these ancient super-species, thought to be mere myths, rise again, they all vie for supremacy, leaving humanity's very existence hanging in the balance.",
                "2019",
                arrayListOf("Science Fiction", "Action"),
                46,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.monster_hunter,
                "Monster Hunter",
                "A portal transports Lt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home.",
                "2020",
                arrayListOf("Fantasy", "Action", "Adventure"),
                71,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.fear_of_rain,
                "Fear of Rain",
                "A teenage girl living with schizophrenia begins to suspect her neighbor has kidnapped a child. Her parents try desperately to help her live a normal life, without exposing their own tragic secrets, and the only person who believes her is Caleb – a boy she isn’t even sure exists.",
                "2021",
                arrayListOf("Thriller", "Horror", "Drama"),
                77,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.fate_the_winx_saga,
                "Fate: The Winx Saga",
                "The coming-of-age journey of five fairies attending Alfea, a magical boarding school in the Otherworld where they must learn to master their powers while navigating love, rivalries, and the monsters that threaten their very existence.",
                "2021",
                arrayListOf("Sci-Fi & Fantasy", "Drama"),
                85,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.tribes_of_europa,
                "Tribes of Europa",
                "2074. In the wake of a mysterious global disaster, war rages between the Tribes that have emerged from the wreckage of Europe. Three siblings from the peaceful Origine tribe are separated and forced to forge their own paths in an action-packed fight for the future of this new Europa.",
                "2021",
                arrayListOf("Sci-Fi & Fantasy", "Drama"),
                85,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.soul,
                "Soul",
                "Joe Gardner is a middle school teacher with a love for jazz music. After a successful gig at the Half Note Club, he suddenly gets into an accident that separates his soul from his body and is transported to the You Seminar, a center in which souls develop and gain passions before being transported to a newborn child. Joe must enlist help from the other souls-in-training, like 22, a soul who has spent eons in the You Seminar, in order to get back to Earth.",
                "2020",
                arrayListOf("Family", "Animation", "Comedy", "Drama", "Music", "Fantasy"),
                83,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.honest_thief,
                "Honest Thief",
                "A bank robber tries to turn himself in because he's falling in love and wants to live an honest life...but when he realizes the Feds are more corrupt than him, he must fight back to clear his name.",
                "2020",
                arrayListOf("Thriller", "Action", "Crime", "Drama"),
                66,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.sputnik,
                "Sputnik",
                "At the height of the Cold War, a Soviet spacecraft crash lands after a mission gone awry, leaving the commander as its only survivor. After a renowned Russian psychologist is brought in to evaluate the commander’s mental state, it becomes clear that something dangerous may have come back to Earth with him.",
                "2020",
                arrayListOf("Science Fiction", "Drama", "Horror"),
                64,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.the_doorman,
                "The Doorman",
                "A former Marine turned doorman at a luxury New York City high-rise must outsmart and battle a group of art thieves and their ruthless leader — while struggling to protect her sister's family. As the thieves become increasingly desperate and violent, the doorman calls upon her deadly fighting skills to end the showdown.",
                "2020",
                arrayListOf("Action", "Thriller"),
                25,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.the_vast_of_night,
                "The Vast of Night",
                "At the dawn of the space-race, two radio-obsessed teens discover a strange frequency over the airwaves in what becomes the most important night of their lives and in the history of their small town.",
                "2020",
                arrayListOf("Mystery", "Science Fiction", "Drama", "Thriller"),
                65,
            )
        )

        movies.add(
            MovieEntity(
                R.drawable.joker,
                "Joker",
                "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
                "2019",
                arrayListOf("Crime", "Thriller", "Drama"),
                82,
            )
        )

        return movies

    }

    fun generateDummyTvShow(): ArrayList<MovieEntity> {

        val tvShow = ArrayList<MovieEntity>()

        tvShow.add(
            MovieEntity(
                R.drawable.legacies,
                "Legacies",
                "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted.",
                "2018",
                arrayListOf("Sci-Fi & Fantasy", "Drama"),
                86,
            )
        )

        tvShow.add(
            MovieEntity(
                R.drawable.the_mandalorian,
                "The Mandalorian",
                "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                "2019",
                arrayListOf("Sci-Fi & Fantasy", "Action & Adventure"),
                85,
            )
        )

        tvShow.add(
            MovieEntity(
                R.drawable.young_sheldon,
                "Young Sheldon",
                "The early life of child genius Sheldon Cooper, later seen in The Big Bang Theory.",
                "2017",
                arrayListOf("Comedy"),
                80,
            )
        )

        tvShow.add(
            MovieEntity(
                R.drawable.the_flash,
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                arrayListOf("Drama", "Sci-Fi & Fantasy"),
                76,
            )
        )

        tvShow.add(
            MovieEntity(
                R.drawable.fear_the_walking_dead,
                "Fear the Walking Dead",
                "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "2015",
                arrayListOf("Action & Adventure", "Drama"),
                76,
            )
        )

        tvShow.add(
            MovieEntity(
                R.drawable.lupin,
                "Lupin",
                "Inspired by the adventures of Arsène Lupin, gentleman thief Assane Diop sets out to avenge his father for an injustice inflicted by a wealthy family.",
                "2021",
                arrayListOf("Crime", "Drama", "Mystery"),
                79,
            )
        )

        tvShow.add(
            MovieEntity(
                R.drawable.supernatural,
                "Supernatural",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "2005",
                arrayListOf("Drama", "Mystery", "Sci-Fi & Fantasy"),
                79,
            )
        )

        tvShow.add(
            MovieEntity(
                R.drawable.american_horror_story,
                "American Horror Story",
                "An anthology horror drama series centering on different characters and locations, including a house with a murderous past, an asylum, a witch coven, a freak show, a hotel, a farmhouse in Roanoke and a cult.",
                "2011",
                arrayListOf("Drama", "Mystery", "Sci-Fi & Fantasy"),
                80,
            )
        )

        tvShow.add(
            MovieEntity(
                R.drawable.the_street,
                "The Street",
                "Ulice is a Czech soap opera produced and broadcast by Nova. In the Czech language Ulice means street.\n" + "\n" + "The show describes the lives of the Farský, Jordán, Boháč, Nikl, and Liška families and many other people that live in Prague. Their daily battle against real problems of living in a modern world like divorce, love, betrayal and illness or disease. Ulice often shows crime.",
                "2005",
                arrayListOf("Drama", "Comedy"),
                10,
            )
        )

        tvShow.add(
            MovieEntity(
                R.drawable.the_neighborhood,
                "The Neighborhood",
                "The nicest guy in the Midwest moves his family into a tough neighborhood in Los Angeles where not everyone appreciates his extreme neighborliness. That includes their new next-door neighbor Calvin.",
                "2018",
                arrayListOf("Comedy"),
                77,
            )
        )

        return tvShow

    }

}