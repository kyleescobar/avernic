public final class class210 {
   boolean field2500 = true;
   int field2501;
   int field2502;
   int field2503;
   int field2504;
   int field2505;
   int field2506;

   public static final void method3831(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            class258.method4324(var0 - 1L);
            class258.method4324(1L);
         } else {
            class258.method4324(var0);
         }

      }
   }

   class210(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field2506 = var1;
      this.field2501 = var2;
      this.field2502 = var3;
      this.field2503 = var4;
      this.field2504 = var5;
      this.field2505 = var6;
      this.field2500 = var7;
   }

   static int method3832(int var0, class59 var1, boolean var2) {
      int var4;
      if (4200 == var0) {
         var4 = class51.field747[--class51.field746];
         class51.field738[++class2.field4 - 1] = KeyHandler.method93(var4).field1836;
         return 1;
      } else {
         int var5;
         class157 var6;
         if (var0 == 4201) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[1 + class51.field746];
            var6 = KeyHandler.method93(var4);
            if (var5 >= 1 && var5 <= 5 && var6.field1809[var5 - 1] != null) {
               class51.field738[++class2.field4 - 1] = var6.field1809[var5 - 1];
            } else {
               class51.field738[++class2.field4 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            class51.field746 -= 2;
            var4 = class51.field747[class51.field746];
            var5 = class51.field747[class51.field746 + 1];
            var6 = KeyHandler.method93(var4);
            if (var5 >= 1 && var5 <= 5 && var6.field1810[var5 - 1] != null) {
               class51.field738[++class2.field4 - 1] = var6.field1810[var5 - 1];
            } else {
               class51.field738[++class2.field4 - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var4 = class51.field747[--class51.field746];
            class51.field747[++class51.field746 - 1] = KeyHandler.method93(var4).field1807;
            return 1;
         } else if (var0 == 4204) {
            var4 = class51.field747[--class51.field746];
            class51.field747[++class51.field746 - 1] = KeyHandler.method93(var4).field1806 == 1 ? 1 : 0;
            return 1;
         } else {
            class157 var8;
            if (4205 == var0) {
               var4 = class51.field747[--class51.field746];
               var8 = KeyHandler.method93(var4);
               if (-1 == var8.field1789 && var8.field1827 >= 0) {
                  class51.field747[++class51.field746 - 1] = var8.field1827;
               } else {
                  class51.field747[++class51.field746 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4206) {
               var4 = class51.field747[--class51.field746];
               var8 = KeyHandler.method93(var4);
               if (var8.field1789 >= 0 && var8.field1827 >= 0) {
                  class51.field747[++class51.field746 - 1] = var8.field1827;
               } else {
                  class51.field747[++class51.field746 - 1] = var4;
               }

               return 1;
            } else if (4207 == var0) {
               var4 = class51.field747[--class51.field746];
               class51.field747[++class51.field746 - 1] = KeyHandler.method93(var4).field1808 ? 1 : 0;
               return 1;
            } else if (4208 == var0) {
               var4 = class51.field747[--class51.field746];
               var8 = KeyHandler.method93(var4);
               if (var8.field1820 == -1 && var8.field1838 >= 0) {
                  class51.field747[++class51.field746 - 1] = var8.field1838;
               } else {
                  class51.field747[++class51.field746 - 1] = var4;
               }

               return 1;
            } else if (4209 == var0) {
               var4 = class51.field747[--class51.field746];
               var8 = KeyHandler.method93(var4);
               if (var8.field1820 >= 0 && var8.field1838 >= 0) {
                  class51.field747[++class51.field746 - 1] = var8.field1838;
               } else {
                  class51.field747[++class51.field746 - 1] = var4;
               }

               return 1;
            } else if (4210 == var0) {
               String var7 = class51.field738[--class2.field4];
               var5 = class51.field747[--class51.field746];
               class185.method3202(var7, 1 == var5);
               class51.field747[++class51.field746 - 1] = class212.field2520;
               return 1;
            } else if (4211 != var0) {
               if (var0 == 4212) {
                  class82.field1165 = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var4 = class51.field747[--class51.field746];
                  var5 = KeyHandler.method93(var4).method2701();
                  if (var5 == -1) {
                     class51.field747[++class51.field746 - 1] = var5;
                  } else {
                     class51.field747[++class51.field746 - 1] = 1 + var5;
                  }

                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (Npc.field1137 != null && class82.field1165 < class212.field2520) {
                  class51.field747[++class51.field746 - 1] = Npc.field1137[++class82.field1165 - 1] & '\uffff';
               } else {
                  class51.field747[++class51.field746 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   static final void method3830() {
      boolean var1 = false;

      while(!var1) {
         var1 = true;

         for(int var2 = 0; var2 < client.field545 - 1; ++var2) {
            if (client.field548[var2] < 1000 && client.field548[1 + var2] > 1000) {
               String var3 = client.field551[var2];
               client.field551[var2] = client.field551[var2 + 1];
               client.field551[var2 + 1] = var3;
               String var4 = client.field485[var2];
               client.field485[var2] = client.field485[var2 + 1];
               client.field485[1 + var2] = var4;
               int var5 = client.field548[var2];
               client.field548[var2] = client.field548[var2 + 1];
               client.field548[1 + var2] = var5;
               var5 = client.field678[var2];
               client.field678[var2] = client.field678[1 + var2];
               client.field678[var2 + 1] = var5;
               var5 = client.field547[var2];
               client.field547[var2] = client.field547[1 + var2];
               client.field547[1 + var2] = var5;
               var5 = client.field549[var2];
               client.field549[var2] = client.field549[var2 + 1];
               client.field549[var2 + 1] = var5;
               boolean var6 = client.field674[var2];
               client.field674[var2] = client.field674[var2 + 1];
               client.field674[1 + var2] = var6;
               var1 = false;
            }
         }
      }

   }
}
