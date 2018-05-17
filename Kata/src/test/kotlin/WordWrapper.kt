import org.assertj.core.api.Assertions
import kotlin.test.Test


class WordWrapper {
    //Assign
    val wrapper = Wrapper();
    val colNum = 10;

    @Test
    fun breaksLoremIpsum() {
        //Assign
        val sentence1 = "Lorem ipsum";
        val outcomeSentence1 = "Lorem\nipsum";
        //Act
        val brokenString = wrapper.breakString(sentence1, colNum);
        //Assert
        Assertions.assertThat(brokenString).isEqualTo(outcomeSentence1)
    }

    @Test
    fun breaksHelloWorld() {
        //Assign
        val sentence2 = "Hello world";
        val outcomeSentence2 = "Hello\nworld";
        //Act
        val secondString = wrapper.breakString(sentence2, colNum)
        //Assert
        Assertions.assertThat(secondString).isEqualTo(outcomeSentence2)
    }

    @Test
    fun breaksWordLongerThanColNum() {
        //Assign
        val longWord = "consectetur"
        val outcomeLongWord =  "consectetu\nr"
        //Act
        val longWordString = wrapper.breakString(longWord, colNum)
        //Assert
        Assertions.assertThat(longWordString).isEqualTo(outcomeLongWord)
    }
}

class Wrapper {
    fun breakString(string: String, colNum: Int): String{
        return string.replace(" ", "\n")
    }
}

//You write a class called Wrapper, that has a single static function named wrap that takes two arguments, a string,
// and a column number. The function returns the string, but with line breaks inserted at just the right places to make
// sure that no line is longer than the column number. You try to break lines at word boundaries.