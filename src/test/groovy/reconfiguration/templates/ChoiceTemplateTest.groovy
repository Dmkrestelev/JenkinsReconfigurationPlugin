package test.groovy.reconfiguration.templates

import main.groovy.templates.ChoiceTemplate
import org.junit.Test
import static org.junit.Assert.*

class ChoiceTemplateTest {

    @Test
    void call() {
        String res = new ChoiceTemplate().html(["a", "b", "c"])
        assertEquals("<select class='choiceSelect'><option class='choiceOption' value='a' name='a'>a</option>\n" +
                "<option class='choiceOption' value='b' name='b'>b</option>\n" +
                "<option class='choiceOption' value='c' name='c'>c</option></select>", res)
    }

    @Test
    void callWithEmptyValue() {
        String res = new ChoiceTemplate().html(["", "b", "c"])
        assertEquals("<select class='choiceSelect'><option class='choiceOption' value='' name=''></option>\n" +
                "<option class='choiceOption' value='b' name='b'>b</option>\n" +
                "<option class='choiceOption' value='c' name='c'>c</option></select>", res)
    }

    @Test
    void callWithoutValues() {
        String res = new ChoiceTemplate().html()
        assertEquals("<select class='choiceSelect'><option class='choiceOption' value='' name=''></option></select>", res)
    }
}
