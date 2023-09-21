// Определение главного модуля приложения
// It now uses BinFuncProvider.
module appstart {
  // требуется модуль appfuncs и userfuncs
  requires appfuncs;
  requires userfuncs;
  
  // в модуле применяется интерфейс BinFuncProvider
  uses userfuncs.binaryfuncs.BinFuncProvider;
}