package vorobev.basic.tasks

fun main() {
    print("How was your experience with us? (enter a number from 1 to 5): ")
    val rating = readln()
    print("Please leave a comment: ")
    val comment = readln()
    print("Thank you for your opinion\nou left us a rating of $rating\nThe text of your comment: $comment")
}