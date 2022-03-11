package codechallenges;

import org.junit.jupiter.api.Test;

public class BracketValidatorTest {

    @Test
    public void BracketValidatorTestValidSyntax() {
        BracketValidator sut = new BracketValidator();
        assert(sut.validator("(({[]}))"));
    }

    @Test
    public void BracketValidatorTestInvalidSyntex() {
        BracketValidator sut = new BracketValidator();
        assert(!sut.validator("(({{}})]"));
    }
    @Test
    public void BracketValidatorTestInValidOrder() {
        BracketValidator sut = new BracketValidator();
        assert(!sut.validator("({[}])"));
    }
    @Test
    public void BracketValidatorTestValidCode() {
        BracketValidator sut = new BracketValidator();
        assert(sut.validator("console.log(Math.max(array[0]))"));
    }
    @Test
    public void BracketValidatorTestInvalidCode() {
        BracketValidator sut = new BracketValidator();
        assert(!sut.validator("return array.map(el => el[prop].toUpperCase()"));
    }
}
