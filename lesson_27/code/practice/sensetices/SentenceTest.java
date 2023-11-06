package practice.sensetices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    Sentence sentence;

    @BeforeEach
    void setUp() {
        sentence= new Sentence();//вызвали пустой конструктор, который есть по умолчанию у всех объектов
    }

    @Test
    void countWords() {
        String str= "One, two ,  three . ";
        assertEquals(3,sentence.countWords(str));
    }

    @Test
    void countSymbols() {
        String str= "One, two  ,     three.";
        assertEquals(14,sentence.countSymbols(str));
    }
}