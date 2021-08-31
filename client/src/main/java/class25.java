import java.io.IOException;

public class class25 {
   protected static boolean field199;
   static class359 field202;
   static int field182;
   static int field185;
   static int field192;
   boolean field198 = true;
   class31 field184;
   class31[] field190 = new class31[8];
   class31[] field197 = new class31[8];
   int field181;
   int field187;
   int field188 = 0;
   int field189;
   int field191 = 0;
   int field193 = 0;
   int field195 = 32;
   int field196 = 0;
   long field186 = class87.method1989();
   long field194 = 0L;
   long field200 = 0L;
   protected int[] field183;

   public static class150 method403(int var0) {
      class150 var2 = (class150)class150.field1660.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class150.field1675.method4412(13, var0);
         var2 = new class150();
         var2.field1678 = var0;
         if (var3 != null) {
            var2.method2504(new Buffer(var3));
         }

         class150.field1660.method3882(var2, (long)var0);
         return var2;
      }
   }

   static boolean method450(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (0 == var8) {
               if (var9 == '-') {
                  var4 = true;
                  continue;
               }

               if (var9 == '+' && var2) {
                  continue;
               }
            }

            int var11;
            if (var9 >= '0' && var9 <= '9') {
               var11 = var9 - 48;
            } else if (var9 >= 'A' && var9 <= 'Z') {
               var11 = var9 - 55;
            } else {
               if (var9 < 'a' || var9 > 'z') {
                  return false;
               }

               var11 = var9 - 87;
            }

            if (var11 >= var1) {
               return false;
            }

            if (var4) {
               var11 = -var11;
            }

            int var10 = var1 * var6 + var11;
            if (var10 / var1 != var6) {
               return false;
            }

            var6 = var10;
            var5 = true;
         }

         return var5;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   protected class25() {
   }

   public final synchronized void method406(class31 var1) {
      this.field184 = var1;
   }

   public final synchronized void method391() {
      if (this.field183 != null) {
         long var2 = class87.method1989();

         try {
            if (this.field200 != 0L) {
               if (var2 < this.field200) {
                  return;
               }

               this.method399(this.field187);
               this.field200 = 0L;
               this.field198 = true;
            }

            int var4 = this.method423();
            if (this.field193 - var4 > this.field191) {
               this.field191 = this.field193 - var4;
            }

            int var5 = this.field181 + this.field189;
            if (var5 + 256 > 16384) {
               var5 = 16128;
            }

            if (var5 + 256 > this.field187) {
               this.field187 += 1024;
               if (this.field187 > 16384) {
                  this.field187 = 16384;
               }

               this.method402();
               this.method399(this.field187);
               var4 = 0;
               this.field198 = true;
               if (256 + var5 > this.field187) {
                  var5 = this.field187 - 256;
                  this.field189 = var5 - this.field181;
               }
            }

            while(var4 < var5) {
               this.method396(this.field183, 256);
               this.method397();
               var4 += 256;
            }

            if (var2 > this.field194) {
               if (!this.field198) {
                  if (0 == this.field191 && 0 == this.field188) {
                     this.method402();
                     this.field200 = var2 + 2000L;
                     return;
                  }

                  this.field189 = Math.min(this.field188, this.field191);
                  this.field188 = this.field191;
               } else {
                  this.field198 = false;
               }

               this.field191 = 0;
               this.field194 = 2000L + var2;
            }

            this.field193 = var4;
         } catch (Exception var7) {
            this.method402();
            this.field200 = 2000L + var2;
         }

         try {
            if (var2 > 500000L + this.field186) {
               var2 = this.field186;
            }

            while(var2 > 5000L + this.field186) {
               this.method395(256);
               this.field186 += (long)(256000 / class282.field3634);
            }
         } catch (Exception var6) {
            this.field186 = var2;
         }

      }
   }

   static class76 method437() {
      class369 var1 = null;
      class76 var2 = new class76();

      try {
         var1 = Npc.method1836("", class69.field976.field3208, false);
         byte[] var3 = new byte[(int)var1.method5773()];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.method5779(var3, var4, var3.length - var4);
            if (-1 == var5) {
               throw new IOException();
            }
         }

         var2 = new class76(new Buffer(var3));
      } catch (Exception var7) {
      }

      try {
         if (var1 != null) {
            var1.method5776();
         }
      } catch (Exception var6) {
      }

      return var2;
   }

   public final void method419() {
      this.field198 = true;
   }

   public final synchronized void method393() {
      this.field198 = true;

      try {
         this.method410();
      } catch (Exception var3) {
         this.method402();
         this.field200 = class87.method1989() + 2000L;
      }

   }

   public final synchronized void method394() {
      if (class212.field2518 != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (class212.field2518.field219[var3] == this) {
               class212.field2518.field219[var3] = null;
            }

            if (null != class212.field2518.field219[var3]) {
               var2 = false;
            }
         }

         if (var2) {
            class334.field3903.shutdownNow();
            class334.field3903 = null;
            class212.field2518 = null;
         }
      }

      this.method402();
      this.field183 = null;
   }

   final void method395(int var1) {
      this.field196 -= var1;
      if (this.field196 < 0) {
         this.field196 = 0;
      }

      if (this.field184 != null) {
         this.field184.method635(var1);
      }

   }

   final void method396(int[] var1, int var2) {
      int var3 = var2;
      if (field199) {
         var3 = var2 << 1;
      }

      class309.method5027(var1, 0, var3);
      this.field196 -= var2;
      if (null != this.field184 && this.field196 <= 0) {
         this.field196 += class282.field3634 >> 4;
         class13.method106(this.field184);
         this.method389(this.field184, this.field184.method636());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class31 var10;
         label103:
         for(var6 = 7; 0 != var5; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if (0 != (var9 & 1)) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class31 var11 = this.field197[var7];

                  label97:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label97;
                        }

                        class41 var12 = var11.field253;
                        if (var12 != null && var12.field350 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field252;
                        } else {
                           var11.field251 = true;
                           int var13 = var11.method632();
                           var4 += var13;
                           if (var12 != null) {
                              var12.field350 += var13;
                           }

                           if (var4 >= this.field195) {
                              break label103;
                           }

                           class31 var14 = var11.method643();
                           if (var14 != null) {
                              for(int var15 = var11.field254; null != var14; var14 = var11.method631()) {
                                 this.method389(var14, var15 * var14.method636() >> 8);
                              }
                           }

                           class31 var18 = var11.field252;
                           var11.field252 = null;
                           if (null == var10) {
                              this.field197[var7] = var18;
                           } else {
                              var10.field252 = var18;
                           }

                           if (var18 == null) {
                              this.field190[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class31 var16 = this.field197[var6];
            class31[] var17 = this.field197;
            this.field190[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field252;
               var16.field252 = null;
            }
         }
      }

      if (this.field196 < 0) {
         this.field196 = 0;
      }

      if (this.field184 != null) {
         this.field184.method641(var1, 0, var2);
      }

      this.field186 = class87.method1989();
   }

   final void method389(class31 var1, int var2) {
      int var4 = var2 >> 5;
      class31 var5 = this.field190[var4];
      if (null == var5) {
         this.field197[var4] = var1;
      } else {
         var5.field252 = var1;
      }

      this.field190[var4] = var1;
      var1.field254 = var2;
   }

   protected void method398() throws Exception {
   }

   protected void method399(int var1) throws Exception {
   }

   protected int method423() throws Exception {
      return this.field187;
   }

   protected void method397() throws Exception {
   }

   protected void method402() {
   }

   protected void method410() throws Exception {
   }

   static final void method400(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (!client.isMenuOpen) {
         if (client.field545 < 500) {
            client.field485[client.field545] = var0;
            client.field551[client.field545] = var1;
            client.field548[client.field545] = var2;
            client.field549[client.field545] = var3;
            client.field678[client.field545] = var4;
            client.field547[client.field545] = var5;
            client.field674[client.field545] = var6;
            ++client.field545;
         }

      }
   }

   static final void method446() {
      PacketBufferNode var1 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2657, client.packetWriter.isaacCipher);
      client.packetWriter.addNode(var1);

      for(InterfaceParent var2 = (InterfaceParent)client.interfaceParents.method5736(); null != var2; var2 = (InterfaceParent)client.interfaceParents.method5739()) {
         if (0 == var2.field949 || 3 == var2.field949) {
            class162.closeInterface(var2, true);
         }
      }

      if (null != client.field574) {
         class81.invalidateComponent(client.field574);
         client.field574 = null;
      }

   }

   static String method413(Interface var0) {
      if (class104.method2082(class241.method4140(var0)) == 0) {
         return null;
      } else {
         return var0.field3043 != null && var0.field3043.trim().length() != 0 ? var0.field3043 : null;
      }
   }
}
