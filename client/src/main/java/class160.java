public class class160 {
   int field1881;
   int field1885 = 0;
   int field1887;
   int field1888 = 0;
   public int[][] field1889;

   public static PacketBufferNode createPacketNode() {
      return 0 == PacketBufferNode.field2687 ? new PacketBufferNode() : PacketBufferNode.field2689[--PacketBufferNode.field2687];
   }

   public class160(int var1, int var2) {
      this.field1887 = var1;
      this.field1881 = var2;
      this.field1889 = new int[this.field1887][this.field1881];
      this.method2808();
   }

   public void method2808() {
      for(int var2 = 0; var2 < this.field1887; ++var2) {
         for(int var3 = 0; var3 < this.field1881; ++var3) {
            if (0 != var2 && 0 != var3 && var2 < this.field1887 - 5 && var3 < this.field1881 - 5) {
               this.field1889[var2][var3] = 16777216;
            } else {
               this.field1889[var2][var3] = 16777215;
            }
         }
      }

   }

   public void method2809(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field1885;
      var2 -= this.field1888;
      if (var3 == 0) {
         if (0 == var4) {
            this.method2813(var1, var2, 128);
            this.method2813(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method2813(var1, var2, 2);
            this.method2813(var1, 1 + var2, 32);
         }

         if (2 == var4) {
            this.method2813(var1, var2, 8);
            this.method2813(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method2813(var1, var2, 32);
            this.method2813(var1, var2 - 1, 2);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            this.method2813(var1, var2, 1);
            this.method2813(var1 - 1, var2 + 1, 16);
         }

         if (1 == var4) {
            this.method2813(var1, var2, 4);
            this.method2813(var1 + 1, var2 + 1, 64);
         }

         if (2 == var4) {
            this.method2813(var1, var2, 16);
            this.method2813(1 + var1, var2 - 1, 1);
         }

         if (3 == var4) {
            this.method2813(var1, var2, 64);
            this.method2813(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method2813(var1, var2, 130);
            this.method2813(var1 - 1, var2, 8);
            this.method2813(var1, 1 + var2, 32);
         }

         if (1 == var4) {
            this.method2813(var1, var2, 10);
            this.method2813(var1, 1 + var2, 32);
            this.method2813(1 + var1, var2, 128);
         }

         if (2 == var4) {
            this.method2813(var1, var2, 40);
            this.method2813(1 + var1, var2, 128);
            this.method2813(var1, var2 - 1, 2);
         }

         if (3 == var4) {
            this.method2813(var1, var2, 160);
            this.method2813(var1, var2 - 1, 2);
            this.method2813(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (0 == var4) {
               this.method2813(var1, var2, 65536);
               this.method2813(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method2813(var1, var2, 1024);
               this.method2813(var1, var2 + 1, 16384);
            }

            if (2 == var4) {
               this.method2813(var1, var2, 4096);
               this.method2813(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method2813(var1, var2, 16384);
               this.method2813(var1, var2 - 1, 1024);
            }
         }

         if (1 == var3 || 3 == var3) {
            if (0 == var4) {
               this.method2813(var1, var2, 512);
               this.method2813(var1 - 1, 1 + var2, 8192);
            }

            if (var4 == 1) {
               this.method2813(var1, var2, 2048);
               this.method2813(var1 + 1, 1 + var2, 32768);
            }

            if (var4 == 2) {
               this.method2813(var1, var2, 8192);
               this.method2813(var1 + 1, var2 - 1, 512);
            }

            if (3 == var4) {
               this.method2813(var1, var2, 32768);
               this.method2813(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.method2813(var1, var2, 66560);
               this.method2813(var1 - 1, var2, 4096);
               this.method2813(var1, 1 + var2, 16384);
            }

            if (1 == var4) {
               this.method2813(var1, var2, 5120);
               this.method2813(var1, var2 + 1, 16384);
               this.method2813(var1 + 1, var2, 65536);
            }

            if (2 == var4) {
               this.method2813(var1, var2, 20480);
               this.method2813(1 + var1, var2, 65536);
               this.method2813(var1, var2 - 1, 1024);
            }

            if (3 == var4) {
               this.method2813(var1, var2, 81920);
               this.method2813(var1, var2 - 1, 1024);
               this.method2813(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method2840(int var1, int var2, int var3, int var4, boolean var5) {
      int var7 = 256;
      if (var5) {
         var7 += 131072;
      }

      var1 -= this.field1885;
      var2 -= this.field1888;

      for(int var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.field1887) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.field1881) {
                  this.method2813(var8, var9, var7);
               }
            }
         }
      }

   }

   public void method2807(int var1, int var2) {
      var1 -= this.field1885;
      var2 -= this.field1888;
      int[] var10000 = this.field1889[var1];
      var10000[var2] |= 2097152;
   }

   public void method2834(int var1, int var2) {
      var1 -= this.field1885;
      var2 -= this.field1888;
      int[] var10000 = this.field1889[var1];
      var10000[var2] |= 262144;
   }

   void method2813(int var1, int var2, int var3) {
      int[] var10000 = this.field1889[var1];
      var10000[var2] |= var3;
   }

   public void method2814(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field1885;
      var2 -= this.field1888;
      if (0 == var3) {
         if (var4 == 0) {
            this.method2816(var1, var2, 128);
            this.method2816(var1 - 1, var2, 8);
         }

         if (1 == var4) {
            this.method2816(var1, var2, 2);
            this.method2816(var1, 1 + var2, 32);
         }

         if (2 == var4) {
            this.method2816(var1, var2, 8);
            this.method2816(1 + var1, var2, 128);
         }

         if (3 == var4) {
            this.method2816(var1, var2, 32);
            this.method2816(var1, var2 - 1, 2);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            this.method2816(var1, var2, 1);
            this.method2816(var1 - 1, 1 + var2, 16);
         }

         if (1 == var4) {
            this.method2816(var1, var2, 4);
            this.method2816(1 + var1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method2816(var1, var2, 16);
            this.method2816(1 + var1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method2816(var1, var2, 64);
            this.method2816(var1 - 1, var2 - 1, 4);
         }
      }

      if (2 == var3) {
         if (0 == var4) {
            this.method2816(var1, var2, 130);
            this.method2816(var1 - 1, var2, 8);
            this.method2816(var1, var2 + 1, 32);
         }

         if (1 == var4) {
            this.method2816(var1, var2, 10);
            this.method2816(var1, var2 + 1, 32);
            this.method2816(1 + var1, var2, 128);
         }

         if (var4 == 2) {
            this.method2816(var1, var2, 40);
            this.method2816(var1 + 1, var2, 128);
            this.method2816(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method2816(var1, var2, 160);
            this.method2816(var1, var2 - 1, 2);
            this.method2816(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.method2816(var1, var2, 65536);
               this.method2816(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method2816(var1, var2, 1024);
               this.method2816(var1, var2 + 1, 16384);
            }

            if (2 == var4) {
               this.method2816(var1, var2, 4096);
               this.method2816(1 + var1, var2, 65536);
            }

            if (var4 == 3) {
               this.method2816(var1, var2, 16384);
               this.method2816(var1, var2 - 1, 1024);
            }
         }

         if (1 == var3 || 3 == var3) {
            if (0 == var4) {
               this.method2816(var1, var2, 512);
               this.method2816(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method2816(var1, var2, 2048);
               this.method2816(1 + var1, 1 + var2, 32768);
            }

            if (var4 == 2) {
               this.method2816(var1, var2, 8192);
               this.method2816(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method2816(var1, var2, 32768);
               this.method2816(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.method2816(var1, var2, 66560);
               this.method2816(var1 - 1, var2, 4096);
               this.method2816(var1, 1 + var2, 16384);
            }

            if (var4 == 1) {
               this.method2816(var1, var2, 5120);
               this.method2816(var1, var2 + 1, 16384);
               this.method2816(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method2816(var1, var2, 20480);
               this.method2816(1 + var1, var2, 65536);
               this.method2816(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method2816(var1, var2, 81920);
               this.method2816(var1, var2 - 1, 1024);
               this.method2816(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method2832(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var8 = 256;
      if (var6) {
         var8 += 131072;
      }

      var1 -= this.field1885;
      var2 -= this.field1888;
      int var9;
      if (var5 == 1 || 3 == var5) {
         var9 = var3;
         var3 = var4;
         var4 = var9;
      }

      for(var9 = var1; var9 < var1 + var3; ++var9) {
         if (var9 >= 0 && var9 < this.field1887) {
            for(int var10 = var2; var10 < var2 + var4; ++var10) {
               if (var10 >= 0 && var10 < this.field1881) {
                  this.method2816(var9, var10, var8);
               }
            }
         }
      }

   }

   void method2816(int var1, int var2, int var3) {
      int[] var10000 = this.field1889[var1];
      var10000[var2] &= ~var3;
   }

   public void method2838(int var1, int var2) {
      var1 -= this.field1885;
      var2 -= this.field1888;
      int[] var10000 = this.field1889[var1];
      var10000[var2] &= -262145;
   }

   static final int method2842() {
      return client.field545 - 1;
   }
}
