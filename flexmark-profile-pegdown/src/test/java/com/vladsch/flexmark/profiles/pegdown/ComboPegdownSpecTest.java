package com.vladsch.flexmark.profiles.pegdown;

import com.vladsch.flexmark.IParse;
import com.vladsch.flexmark.IRender;
import com.vladsch.flexmark.spec.SpecExample;
import com.vladsch.flexmark.spec.SpecReader;
import com.vladsch.flexmark.test.ComboExtraSpecTest;
import com.vladsch.flexmark.util.options.DataHolder;
import com.vladsch.flexmark.util.options.MutableDataSet;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComboPegdownSpecTest extends ComboExtraSpecTest {
    private static final String SPEC_RESOURCE = "/pegdown_spec.md";
    private static final DataHolder OPTIONS = new MutableDataSet()
            .set(PegdownParser.PEGDOWN_EXTENSIONS, Extensions.FENCED_CODE_BLOCKS);

    private static final Map<String, DataHolder> optionsMap = new HashMap<>();
    static {

    }

    private static final IParse PARSER = new PegdownParser(OPTIONS);

    private static final IRender RENDERER = new PegdownRenderer(OPTIONS);

    private static DataHolder optionsSet(String optionSet) {
        return optionsMap.get(optionSet);
    }

    public ComboPegdownSpecTest(SpecExample example) {
        super(example);
    }

    @Parameterized.Parameters(name = "{0}")
    public static List<Object[]> data() {
        List<SpecExample> examples = SpecReader.readExamples(SPEC_RESOURCE);
        List<Object[]> data = new ArrayList<>();

        // NULL example runs full spec test
        data.add(new Object[] { SpecExample.NULL });

        for (SpecExample example : examples) {
            data.add(new Object[] { example });
        }
        return data;
    }

    @Override
    protected DataHolder options(String optionSet) {
        return optionsSet(optionSet);
    }

    @Override
    protected String getSpecResourceName() {
        return SPEC_RESOURCE;
    }

    @Override
    protected IParse parser() {
        return PARSER;
    }

    @Override
    protected IRender renderer() {
        return RENDERER;
    }
}
