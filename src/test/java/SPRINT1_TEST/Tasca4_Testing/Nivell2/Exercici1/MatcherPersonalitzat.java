package SPRINT1_TEST.Tasca4_Testing.Nivell2.Exercici1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class MatcherPersonalitzat extends FeatureMatcher<String, Integer> {

    public MatcherPersonalitzat(Matcher <? super Integer> subMatcher) {
        super(subMatcher,
                "Calculem la longitud d'un String.",
                "Error: la longitud no coincideix amb el valor esperat.");
    }

    @Override
    protected Integer featureValueOf(String s) {
        return s.length();
    }
}
