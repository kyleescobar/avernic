public class class12 implements class33 {
   public static int field71;
   static class277 field72;
   static int field69;

   class12() {
   }

   public class25 method652() {
      return new class14();
   }

   static char method97(char var0) {
      switch(var0) {
      case ' ':
      case '-':
      case '_':
      case '\u00a0':
         return '_';
      case '#':
      case '[':
      case ']':
         return var0;
      case '\u00c0':
      case '\u00c1':
      case '\u00c2':
      case '\u00c3':
      case '\u00c4':
      case '\u00e0':
      case '\u00e1':
      case '\u00e2':
      case '\u00e3':
      case '\u00e4':
         return 'a';
      case '\u00c7':
      case '\u00e7':
         return 'c';
      case '\u00c8':
      case '\u00c9':
      case '\u00ca':
      case '\u00cb':
      case '\u00e8':
      case '\u00e9':
      case '\u00ea':
      case '\u00eb':
         return 'e';
      case '\u00cd':
      case '\u00ce':
      case '\u00cf':
      case '\u00ed':
      case '\u00ee':
      case '\u00ef':
         return 'i';
      case '\u00d1':
      case '\u00f1':
         return 'n';
      case '\u00d2':
      case '\u00d3':
      case '\u00d4':
      case '\u00d5':
      case '\u00d6':
      case '\u00f2':
      case '\u00f3':
      case '\u00f4':
      case '\u00f5':
      case '\u00f6':
         return 'o';
      case '\u00d9':
      case '\u00da':
      case '\u00db':
      case '\u00dc':
      case '\u00f9':
      case '\u00fa':
      case '\u00fb':
      case '\u00fc':
         return 'u';
      case '\u00df':
         return 'b';
      case '\u00ff':
      case '\u0178':
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }

   static final void method98(String var0, boolean var1) {
      if (client.field523) {
         byte var3 = 4;
         int var4 = var3 + 6;
         int var5 = 6 + var3;
         int var6 = class258.field3165.method4902(var0, 250);
         int var7 = class258.field3165.method4882(var0, 250) * 13;
         class394.method6265(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 0);
         class394.method6292(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, 16777215);
         class258.field3165.method4857(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         int var8 = var4 - var3;
         int var9 = var5 - var3;
         int var10 = var6 + var3 + var3;
         int var11 = var3 + var7 + var3;

         for(int var12 = 0; var12 < client.field591; ++var12) {
            if (client.field622[var12] + client.field623[var12] > var8 && client.field623[var12] < var10 + var8 && client.field619[var12] + client.field626[var12] > var9 && client.field626[var12] < var11 + var9) {
               client.field617[var12] = true;
            }
         }

         if (var1) {
            class264.field3194.method6333(0, 0);
         } else {
            class148.method2473(var4, var5, var6, var7);
         }

      }
   }
}
