package MangVaPhuongThuc;

import com.sun.scenario.effect.impl.state.AccessHelper;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array={1,2,4,5};
        System.out.println(Arrays.toString(ChenPhanTuVaoMang(array, 3, 2)));
    }
    static int[] ChenPhanTuVaoMang(int[] array,int value,int viTri){
        int[] newArray = Arrays.copyOf(array,array.length+1);
        for (int i = newArray.length-1; i>=viTri ; i--) {
                newArray[i]= newArray[i-1];

        }
        newArray[viTri]=value;

        return newArray;
    }
}
