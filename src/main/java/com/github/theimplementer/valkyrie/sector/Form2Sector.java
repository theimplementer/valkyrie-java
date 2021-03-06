package com.github.theimplementer.valkyrie.sector;

import static com.github.theimplementer.valkyrie.sector.Form.FORM2;
import static com.github.theimplementer.valkyrie.sector.SectorDefinition.DATA_START;
import static java.util.Arrays.copyOfRange;

public class Form2Sector extends Sector {

    private static final int DATA_SIZE = 2324;

    public Form2Sector(byte[] sectorData) {
        super(sectorData);
    }

    @Override
    public byte[] getData() {
        return copyOfRange(sectorData, DATA_START, DATA_START + DATA_SIZE);
    }

    @Override
    public Form getForm() {
        return FORM2;
    }
}
