// Этот исходный файл обновлён с целью
// использовать класс SupportFuncs,
// также в нём демонстрируется применение
// служб и поставщиков их услуг
package appstart.mymodappdemo;

import java.util.ServiceLoader;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;
import userfuncs.binaryfuncs.*;

public class MyModAppDemo {
  public static void main(String[] args) {
    if (SimpleMathFuncs.isFactor(2, 10))
	  System.out.println("2 - множитель 10");
	 
	System.out.println("Наименьший общий множитель "
	                    + "35 и 105 - "
						+ SimpleMathFuncs.lcf(35, 105));
						
	System.out.println("Наибольший общий множитель "
	                   + "35 и 105 - "
					   + SimpleMathFuncs.gcf(35, 105));
	
	// Воспользоваться служебными операциями
	
	// Получить загрузчик служб
	ServiceLoader<BinFuncProvider> ldr = 
	       ServiceLoader.load(BinFuncProvider.class);
	
	BinaryFunc binOp = null;
	
	// Найти поставщика услуг и получить функцию absPlus()
	for (BinFuncProvider bfp : ldr) {
		if (bfp.get().getName().equals("absPlus")) {
			binOp = bfp.get();
			break;
		}
	}
	
	if (binOp != null) 
		System.out.println("Result of function absPlus(): "
	                        + binOp.func(12, -4));
	else System.out.println("Function absPlus() is not exsists.");
	
	binOp = null;
	
	// Найти поставщика услуг и получить функцию absMinus()
	for (BinFuncProvider bfp : ldr) {
		if (bfp.get().getName().equals("absMinus")) {
			binOp = bfp.get();
			break;
		}
	}
	
	if (binOp != null) 
		System.out.println("Result of function absMinus(): "
	                        + binOp.func(12, -4));
	else System.out.println("Function absMinus() is not exsists.");
  }
}