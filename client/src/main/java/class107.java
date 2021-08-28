public class class107 {
   static int field1319;
   class298 field1311 = new class298();
   int field1310 = -1;
   long field1309;

   public class107(Buffer var1) {
      this.method2097(var1);
   }

   void method2097(Buffer var1) {
      this.field1309 = var1.method5954();
      this.field1310 = var1.readInt();

      for(int var3 = var1.readUnsignedByte(); var3 != 0; var3 = var1.readUnsignedByte()) {
         Object var4;
         if (var3 == 3) {
            var4 = new class126(this);
         } else if (var3 == 1) {
            var4 = new class102(this);
         } else if (var3 == 13) {
            var4 = new class119(this);
         } else if (var3 == 4) {
            var4 = new class111(this);
         } else if (var3 == 6) {
            var4 = new class118(this);
         } else if (var3 == 5) {
            var4 = new class103(this);
         } else if (2 == var3) {
            var4 = new class108(this);
         } else if (var3 == 7) {
            var4 = new class101(this);
         } else if (14 == var3) {
            var4 = new class105(this);
         } else if (8 == var3) {
            var4 = new class122(this);
         } else if (9 == var3) {
            var4 = new class128(this);
         } else if (var3 == 10) {
            var4 = new class114(this);
         } else if (var3 == 11) {
            var4 = new class109(this);
         } else if (var3 == 12) {
            var4 = new class113(this);
         } else {
            if (15 != var3) {
               throw new RuntimeException("");
            }

            var4 = new class123(this);
         }

         ((class104)var4).method2083(var1);
         this.field1311.method4721((class354)var4);
      }

   }

   public void method2096(class115 var1) {
      if (this.field1309 == var1.field1371 && var1.field1364 == this.field1310) {
         for(class104 var3 = (class104)this.field1311.method4724(); null != var3; var3 = (class104)this.field1311.method4726()) {
            var3.method2084(var1);
         }

         ++var1.field1364;
      } else {
         throw new RuntimeException("");
      }
   }

   static final InterfaceParent openInterface(int var0, int var1, int var2) {
      InterfaceParent var4 = new InterfaceParent();
      var4.field950 = var1;
      var4.field949 = var2;
      client.interfaceParents.put(var4, (long)var0);
      class312.resetModelFrames(var1);
      Interface var5 = class87.getComponent(var0);
      class81.invalidateComponent(var5);
      if (client.field574 != null) {
         class81.invalidateComponent(client.field574);
         client.field574 = null;
      }

      for(int var6 = 0; var6 < client.field545; ++var6) {
         if (class27.method464(client.field548[var6])) {
            if (var6 < client.field545 - 1) {
               for(int var7 = var6; var7 < client.field545 - 1; ++var7) {
                  client.field485[var7] = client.field485[1 + var7];
                  client.field551[var7] = client.field551[var7 + 1];
                  client.field548[var7] = client.field548[1 + var7];
                  client.field549[var7] = client.field549[var7 + 1];
                  client.field678[var7] = client.field678[var7 + 1];
                  client.field547[var7] = client.field547[var7 + 1];
                  client.field674[var7] = client.field674[var7 + 1];
               }
            }

            --var6;
            --client.field545;
         }
      }

      class58.method1596();
      class81.revalidateComponent(Interface.components[var0 >> 16], var5, false);
      class113.triggerInterfaceListeners(var1);
      if (-1 != client.rootInterface) {
         class163.dispatchInterfaceCloseEvent(client.rootInterface, 1);
      }

      return var4;
   }
}
