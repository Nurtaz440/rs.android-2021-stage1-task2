import junit.framework.Assert.assertEquals
import org.junit.Test
import subtask2.Abbrivation

class Task2AbbraviationTest {


    private val converter = Abbrivation()

    @Test
    fun testAbbreviation1() {
        assertEquals("YES", converter.abbreviationFromA("daBcd", "ABC"))
    }

    @Test
    fun testAbbreviation2() {
        assertEquals("YES", converter.abbreviationFromA("mnbTy", "BT"))
    }

    @Test
    fun testAbbreviation3() {
        assertEquals("YES", converter.abbreviationFromA("qWerty", "WY"))
    }

    @Test
    fun testAbbreviation4() {
        assertEquals("NO", converter.abbreviationFromA("ytrewq", "RY"))
    }

    @Test
    fun testAbbreviation5() {
        assertEquals("NO", converter.abbreviationFromA("abhfs", "ASCI"))
    }
}