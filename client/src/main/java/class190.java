public class class190 {
   byte[][][] field2129;
   int field2128;

   class190(int var1) {
      this.field2128 = var1;
   }

   void method3280(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field2128 != 0 && this.field2129 != null) {
         var8 = this.method3271(var8, var7);
         var7 = this.method3293(var7);
         class394.method6268(var1, var2, var5, var6, var3, var4, this.field2129[var7 - 1][var8], this.field2128, true);
      }
   }

   int method3271(int var1, int var2) {
      if (9 == var2) {
         var1 = 1 + var1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (11 == var2) {
         var1 = 3 + var1 & 3;
      }

      return var1;
   }

   int method3293(int var1) {
      if (9 != var1 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   void method3273() {
      if (this.field2129 == null) {
         this.field2129 = new byte[8][4][];
         this.method3274();
         this.method3275();
         this.method3277();
         this.method3281();
         this.method3278();
         this.method3279();
         this.method3305();
         this.method3306();
      }
   }

   void method3274() {
      byte[] var2 = new byte[this.field2128 * this.field2128];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[0][0] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[0][1] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[0][2] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[0][3] = var2;
   }

   void method3275() {
      byte[] var2 = new byte[this.field2128 * this.field2128];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[1][0] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var3 >= 0 && var3 < var2.length) {
               if (var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            } else {
               ++var3;
            }
         }
      }

      this.field2129[1][1] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[1][2] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[1][3] = var2;
   }

   void method3277() {
      byte[] var2 = new byte[this.field2128 * this.field2128];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[2][0] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[2][1] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[2][2] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[2][3] = var2;
   }

   void method3281() {
      byte[] var2 = new byte[this.field2128 * this.field2128];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[3][0] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[3][1] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[3][2] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[3][3] = var2;
   }

   void method3278() {
      byte[] var2 = new byte[this.field2128 * this.field2128];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[4][0] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[4][1] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[4][2] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var3 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2129[4][3] = var2;
   }

   void method3279() {
      byte[] var2 = new byte[this.field2128 * this.field2128];
      boolean var3 = false;
      var2 = new byte[this.field2128 * this.field2128];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 <= this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[5][0] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var6 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var4 <= this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[5][1] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var6 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 >= this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[5][2] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var6 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var4 >= this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[5][3] = var2;
   }

   void method3305() {
      byte[] var2 = new byte[this.field2128 * this.field2128];
      boolean var3 = false;
      var2 = new byte[this.field2128 * this.field2128];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 <= var4 - this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[6][0] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var6 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 <= var4 - this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[6][1] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var6 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[6][2] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var6 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[6][3] = var2;
   }

   void method3306() {
      byte[] var2 = new byte[this.field2128 * this.field2128];
      boolean var3 = false;
      var2 = new byte[this.field2128 * this.field2128];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 >= var4 - this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[7][0] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var6 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2128; ++var5) {
            if (var5 >= var4 - this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[7][1] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var6 = 0;

      for(var4 = this.field2128 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[7][2] = var2;
      var2 = new byte[this.field2128 * this.field2128];
      var6 = 0;

      for(var4 = 0; var4 < this.field2128; ++var4) {
         for(var5 = this.field2128 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field2128 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2129[7][3] = var2;
   }
}
