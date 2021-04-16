package Utils;

import java.text.*;
import java.util.*;

public class GerarDataUtil {

    public String gerarData(int qualDiaApartirDoAtual) {

        Calendar cal = Calendar.getInstance();
        DateFormat formatarData = new SimpleDateFormat("MM/dd/yyyy");
        cal.add(Calendar.DAY_OF_MONTH, qualDiaApartirDoAtual);
        Date data = cal.getTime();
        String dataFinal = formatarData.format(data);

        return dataFinal;
    }
}
