package kotlin_example.chapter_8._8_1_6

private val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/f", 16.3, OS.ANDROID)
)

private fun main() {
    println(averageDurationOnOs1(log, OS.WINDOWS))
    println(log.averageDurationOnOs2(OS.MAC))
    println(averageMobileDuration(log))

    println(log.averageDurationFor { it.os == OS.WINDOWS })
    println(log.averageDurationFor { it.os == OS.MAC })
    println(log.averageDurationFor { it.os in setOf(OS.IOS, OS.ANDROID) })
}

private fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    asSequence()
        .filter(predicate)
        .map { it.duration }
        .average()

private fun averageMobileDuration(siteVisits: List<SiteVisit>) =
    siteVisits
        .asSequence()
        .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map { it.duration }
        .average()

private fun List<SiteVisit>.averageDurationOnOs2(os: OS) =
    asSequence().filter { it.os == os }.map { it.duration }.average()

private fun averageDurationOnOs1(siteVisits: List<SiteVisit>, os: OS) =
    siteVisits
        .asSequence()
        .filter { it.os == os }
        .map { it.duration }
        .average()
