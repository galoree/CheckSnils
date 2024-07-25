package org.lanit.validate;

import org.tinylog.Logger;

public class CheckSnils {
    public boolean eligible_for_calculation(String input_snils) {
        String exceptional_snils = "001001998";
        //Возвращает true если input_snils больше чем exceptional_snils, т.е. узнаем можно ли использовать алгоритм на снилсе
        return input_snils.compareTo(exceptional_snils) > 0;
    }

    public int calculate_checksum(String snils) {
        Logger.debug("calculate_checksum: " + snils);
        int checksum = 0;
        int position = 9;

        for (int i = 0; i < 9; i++) {
            checksum += Character.getNumericValue(snils.charAt(i)) * position;
            position--;
        }
        checksum %= 101;

        if (checksum == 100) {
            return 0;
        } else {
            return checksum;
        }
    }
}
