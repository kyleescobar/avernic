public class class30 extends class31 {
   boolean field246;
   int field236;
   int field237;
   int field238;
   int field239;
   int field240;
   int field241;
   int field242;
   int field243;
   int field244;
   int field245;
   int field247;
   int field248;
   int field249;
   int field250;

   static int method585(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int method560(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   int method636() {
      int var1 = this.field240 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field247 == 0) {
         var1 -= var1 * this.field243 / (((class23)super.field253).field165.length << 8);
      } else if (this.field247 >= 0) {
         var1 -= var1 * this.field241 / ((class23)super.field253).field165.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   class30(class23 var1, int var2, int var3) {
      super.field253 = var1;
      this.field241 = var1.field166;
      this.field236 = var1.field167;
      this.field246 = var1.field168;
      this.field237 = var2;
      this.field238 = var3;
      this.field239 = 8192;
      this.field243 = 0;
      this.method494();
   }

   class30(class23 var1, int var2, int var3, int var4) {
      super.field253 = var1;
      this.field241 = var1.field166;
      this.field236 = var1.field167;
      this.field246 = var1.field168;
      this.field237 = var2;
      this.field238 = var3;
      this.field239 = var4;
      this.field243 = 0;
      this.method494();
   }

   public static class30 method537(class23 var0, int var1, int var2) {
      return var0.field165 != null && var0.field165.length != 0 ? new class30(var0, (int)((long)var0.field164 * 256L * (long)var1 / (long)(class282.field3634 * 100)), var2 << 6) : null;
   }

   public static class30 method493(class23 var0, int var1, int var2, int var3) {
      return var0.field165 != null && var0.field165.length != 0 ? new class30(var0, var1, var2, var3) : null;
   }

   void method494() {
      this.field240 = this.field238;
      this.field248 = method585(this.field238, this.field239);
      this.field242 = method560(this.field238, this.field239);
   }

   public synchronized void method566(int var1) {
      this.field247 = var1;
   }

   public synchronized void method496(int var1) {
      this.method498(var1 << 6, this.method500());
   }

   synchronized void method497(int var1) {
      this.method498(var1, this.method500());
   }

   synchronized void method498(int var1, int var2) {
      this.field238 = var1;
      this.field239 = var2;
      this.field245 = 0;
      this.method494();
   }

   public synchronized int method499() {
      return this.field238 == Integer.MIN_VALUE ? 0 : this.field238;
   }

   public synchronized int method500() {
      return this.field239 < 0 ? -1 : this.field239;
   }

   public synchronized void method501(int var1) {
      int var2 = ((class23)super.field253).field165.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field243 = var1;
   }

   public synchronized void method502(boolean var1) {
      this.field237 = (this.field237 ^ this.field237 >> 31) + (this.field237 >>> 31);
      if (var1) {
         this.field237 = -this.field237;
      }

   }

   void method538() {
      if (this.field245 != 0) {
         if (this.field238 == Integer.MIN_VALUE) {
            this.field238 = 0;
         }

         this.field245 = 0;
         this.method494();
      }

   }

   public synchronized void method504(int var1, int var2) {
      this.method505(var1, var2, this.method500());
   }

   public synchronized void method505(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method498(var2, var3);
      } else {
         int var4 = method585(var2, var3);
         int var5 = method560(var2, var3);
         if (this.field248 == var4 && this.field242 == var5) {
            this.field245 = 0;
         } else {
            int var6 = var2 - this.field240;
            if (this.field240 - var2 > var6) {
               var6 = this.field240 - var2;
            }

            if (var4 - this.field248 > var6) {
               var6 = var4 - this.field248;
            }

            if (this.field248 - var4 > var6) {
               var6 = this.field248 - var4;
            }

            if (var5 - this.field242 > var6) {
               var6 = var5 - this.field242;
            }

            if (this.field242 - var5 > var6) {
               var6 = this.field242 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field245 = var1;
            this.field238 = var2;
            this.field239 = var3;
            this.field244 = (var2 - this.field240) / var1;
            this.field249 = (var4 - this.field248) / var1;
            this.field250 = (var5 - this.field242) / var1;
         }
      }
   }

   public synchronized void method506(int var1) {
      if (var1 == 0) {
         this.method497(0);
         this.remove();
      } else if (this.field248 == 0 && this.field242 == 0) {
         this.field245 = 0;
         this.field238 = 0;
         this.field240 = 0;
         this.remove();
      } else {
         int var2 = -this.field240;
         if (this.field240 > var2) {
            var2 = this.field240;
         }

         if (-this.field248 > var2) {
            var2 = -this.field248;
         }

         if (this.field248 > var2) {
            var2 = this.field248;
         }

         if (-this.field242 > var2) {
            var2 = -this.field242;
         }

         if (this.field242 > var2) {
            var2 = this.field242;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field245 = var1;
         this.field238 = Integer.MIN_VALUE;
         this.field244 = -this.field240 / var1;
         this.field249 = -this.field248 / var1;
         this.field250 = -this.field242 / var1;
      }
   }

   public synchronized void method507(int var1) {
      if (this.field237 < 0) {
         this.field237 = -var1;
      } else {
         this.field237 = var1;
      }

   }

   public synchronized int method508() {
      return this.field237 < 0 ? -this.field237 : this.field237;
   }

   public boolean method549() {
      return this.field243 < 0 || this.field243 >= ((class23)super.field253).field165.length << 8;
   }

   public boolean method510() {
      return this.field245 != 0;
   }

   protected class31 method643() {
      return null;
   }

   protected class31 method631() {
      return null;
   }

   protected int method632() {
      return this.field238 == 0 && this.field245 == 0 ? 0 : 1;
   }

   public synchronized void method641(int[] var1, int var2, int var3) {
      if (this.field238 == 0 && this.field245 == 0) {
         this.method635(var3);
      } else {
         class23 var4 = (class23)super.field253;
         int var5 = this.field241 << 8;
         int var6 = this.field236 << 8;
         int var7 = var4.field165.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field247 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field243 < 0) {
            if (this.field237 <= 0) {
               this.method538();
               this.remove();
               return;
            }

            this.field243 = 0;
         }

         if (this.field243 >= var7) {
            if (this.field237 >= 0) {
               this.method538();
               this.remove();
               return;
            }

            this.field243 = var7 - 1;
         }

         if (this.field247 < 0) {
            if (this.field246) {
               if (this.field237 < 0) {
                  var9 = this.method609(var1, var2, var5, var3, var4.field165[this.field241]);
                  if (this.field243 >= var5) {
                     return;
                  }

                  this.field243 = var5 + var5 - 1 - this.field243;
                  this.field237 = -this.field237;
               }

               while(true) {
                  var9 = this.method618(var1, var9, var6, var3, var4.field165[this.field236 - 1]);
                  if (this.field243 < var6) {
                     return;
                  }

                  this.field243 = var6 + var6 - 1 - this.field243;
                  this.field237 = -this.field237;
                  var9 = this.method609(var1, var9, var5, var3, var4.field165[this.field241]);
                  if (this.field243 >= var5) {
                     return;
                  }

                  this.field243 = var5 + var5 - 1 - this.field243;
                  this.field237 = -this.field237;
               }
            } else if (this.field237 < 0) {
               while(true) {
                  var9 = this.method609(var1, var9, var5, var3, var4.field165[this.field236 - 1]);
                  if (this.field243 >= var5) {
                     return;
                  }

                  this.field243 = var6 - 1 - (var6 - 1 - this.field243) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method618(var1, var9, var6, var3, var4.field165[this.field241]);
                  if (this.field243 < var6) {
                     return;
                  }

                  this.field243 = var5 + (this.field243 - var5) % var8;
               }
            }
         } else {
            if (this.field247 > 0) {
               if (this.field246) {
                  label130: {
                     if (this.field237 < 0) {
                        var9 = this.method609(var1, var2, var5, var3, var4.field165[this.field241]);
                        if (this.field243 >= var5) {
                           return;
                        }

                        this.field243 = var5 + var5 - 1 - this.field243;
                        this.field237 = -this.field237;
                        if (--this.field247 == 0) {
                           break label130;
                        }
                     }

                     do {
                        var9 = this.method618(var1, var9, var6, var3, var4.field165[this.field236 - 1]);
                        if (this.field243 < var6) {
                           return;
                        }

                        this.field243 = var6 + var6 - 1 - this.field243;
                        this.field237 = -this.field237;
                        if (--this.field247 == 0) {
                           break;
                        }

                        var9 = this.method609(var1, var9, var5, var3, var4.field165[this.field241]);
                        if (this.field243 >= var5) {
                           return;
                        }

                        this.field243 = var5 + var5 - 1 - this.field243;
                        this.field237 = -this.field237;
                     } while(--this.field247 != 0);
                  }
               } else {
                  int var10;
                  if (this.field237 < 0) {
                     while(true) {
                        var9 = this.method609(var1, var9, var5, var3, var4.field165[this.field236 - 1]);
                        if (this.field243 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field243) / var8;
                        if (var10 >= this.field247) {
                           this.field243 += var8 * this.field247;
                           this.field247 = 0;
                           break;
                        }

                        this.field243 += var8 * var10;
                        this.field247 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method618(var1, var9, var6, var3, var4.field165[this.field241]);
                        if (this.field243 < var6) {
                           return;
                        }

                        var10 = (this.field243 - var5) / var8;
                        if (var10 >= this.field247) {
                           this.field243 -= var8 * this.field247;
                           this.field247 = 0;
                           break;
                        }

                        this.field243 -= var8 * var10;
                        this.field247 -= var10;
                     }
                  }
               }
            }

            if (this.field237 < 0) {
               this.method609(var1, var9, 0, var3, 0);
               if (this.field243 < 0) {
                  this.field243 = -1;
                  this.method538();
                  this.remove();
               }
            } else {
               this.method618(var1, var9, var7, var3, 0);
               if (this.field243 >= var7) {
                  this.field243 = var7;
                  this.method538();
                  this.remove();
               }
            }

         }
      }
   }

   public synchronized void method635(int var1) {
      if (this.field245 > 0) {
         if (var1 >= this.field245) {
            if (this.field238 == Integer.MIN_VALUE) {
               this.field238 = 0;
               this.field242 = 0;
               this.field248 = 0;
               this.field240 = 0;
               this.remove();
               var1 = this.field245;
            }

            this.field245 = 0;
            this.method494();
         } else {
            this.field240 += this.field244 * var1;
            this.field248 += this.field249 * var1;
            this.field242 += this.field250 * var1;
            this.field245 -= var1;
         }
      }

      class23 var2 = (class23)super.field253;
      int var3 = this.field241 << 8;
      int var4 = this.field236 << 8;
      int var5 = var2.field165.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field247 = 0;
      }

      if (this.field243 < 0) {
         if (this.field237 <= 0) {
            this.method538();
            this.remove();
            return;
         }

         this.field243 = 0;
      }

      if (this.field243 >= var5) {
         if (this.field237 >= 0) {
            this.method538();
            this.remove();
            return;
         }

         this.field243 = var5 - 1;
      }

      this.field243 += this.field237 * var1;
      if (this.field247 < 0) {
         if (!this.field246) {
            if (this.field237 < 0) {
               if (this.field243 >= var3) {
                  return;
               }

               this.field243 = var4 - 1 - (var4 - 1 - this.field243) % var6;
            } else {
               if (this.field243 < var4) {
                  return;
               }

               this.field243 = var3 + (this.field243 - var3) % var6;
            }

         } else {
            if (this.field237 < 0) {
               if (this.field243 >= var3) {
                  return;
               }

               this.field243 = var3 + var3 - 1 - this.field243;
               this.field237 = -this.field237;
            }

            while(this.field243 >= var4) {
               this.field243 = var4 + var4 - 1 - this.field243;
               this.field237 = -this.field237;
               if (this.field243 >= var3) {
                  return;
               }

               this.field243 = var3 + var3 - 1 - this.field243;
               this.field237 = -this.field237;
            }

         }
      } else {
         if (this.field247 > 0) {
            if (this.field246) {
               label120: {
                  if (this.field237 < 0) {
                     if (this.field243 >= var3) {
                        return;
                     }

                     this.field243 = var3 + var3 - 1 - this.field243;
                     this.field237 = -this.field237;
                     if (--this.field247 == 0) {
                        break label120;
                     }
                  }

                  do {
                     if (this.field243 < var4) {
                        return;
                     }

                     this.field243 = var4 + var4 - 1 - this.field243;
                     this.field237 = -this.field237;
                     if (--this.field247 == 0) {
                        break;
                     }

                     if (this.field243 >= var3) {
                        return;
                     }

                     this.field243 = var3 + var3 - 1 - this.field243;
                     this.field237 = -this.field237;
                  } while(--this.field247 != 0);
               }
            } else {
               label152: {
                  int var7;
                  if (this.field237 < 0) {
                     if (this.field243 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field243) / var6;
                     if (var7 >= this.field247) {
                        this.field243 += var6 * this.field247;
                        this.field247 = 0;
                        break label152;
                     }

                     this.field243 += var6 * var7;
                     this.field247 -= var7;
                  } else {
                     if (this.field243 < var4) {
                        return;
                     }

                     var7 = (this.field243 - var3) / var6;
                     if (var7 >= this.field247) {
                        this.field243 -= var6 * this.field247;
                        this.field247 = 0;
                        break label152;
                     }

                     this.field243 -= var6 * var7;
                     this.field247 -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field237 < 0) {
            if (this.field243 < 0) {
               this.field243 = -1;
               this.method538();
               this.remove();
            }
         } else if (this.field243 >= var5) {
            this.field243 = var5;
            this.method538();
            this.remove();
         }

      }
   }

   int method618(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field245 > 0) {
            int var6 = var2 + this.field245;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field245 += var2;
            if (this.field237 == 256 && (this.field243 & 255) == 0) {
               if (class25.field199) {
                  var2 = method524(0, ((class23)super.field253).field165, var1, this.field243, var2, this.field248, this.field242, this.field249, this.field250, 0, var6, var3, this);
               } else {
                  var2 = method523(((class23)super.field253).field165, var1, this.field243, var2, this.field240, this.field244, 0, var6, var3, this);
               }
            } else if (class25.field199) {
               var2 = method528(0, 0, ((class23)super.field253).field165, var1, this.field243, var2, this.field248, this.field242, this.field249, this.field250, 0, var6, var3, this, this.field237, var5);
            } else {
               var2 = method527(0, 0, ((class23)super.field253).field165, var1, this.field243, var2, this.field240, this.field244, 0, var6, var3, this, this.field237, var5);
            }

            this.field245 -= var2;
            if (this.field245 != 0) {
               return var2;
            }

            if (!this.method514()) {
               continue;
            }

            return var4;
         }

         if (this.field237 == 256 && (this.field243 & 255) == 0) {
            if (class25.field199) {
               return method516(0, ((class23)super.field253).field165, var1, this.field243, var2, this.field248, this.field242, 0, var4, var3, this);
            }

            return method515(((class23)super.field253).field165, var1, this.field243, var2, this.field240, 0, var4, var3, this);
         }

         if (class25.field199) {
            return method520(0, 0, ((class23)super.field253).field165, var1, this.field243, var2, this.field248, this.field242, 0, var4, var3, this, this.field237, var5);
         }

         return method519(0, 0, ((class23)super.field253).field165, var1, this.field243, var2, this.field240, 0, var4, var3, this, this.field237, var5);
      }
   }

   int method609(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field245 > 0) {
            int var6 = var2 + this.field245;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field245 += var2;
            if (this.field237 == -256 && (this.field243 & 255) == 0) {
               if (class25.field199) {
                  var2 = method526(0, ((class23)super.field253).field165, var1, this.field243, var2, this.field248, this.field242, this.field249, this.field250, 0, var6, var3, this);
               } else {
                  var2 = method525(((class23)super.field253).field165, var1, this.field243, var2, this.field240, this.field244, 0, var6, var3, this);
               }
            } else if (class25.field199) {
               var2 = method492(0, 0, ((class23)super.field253).field165, var1, this.field243, var2, this.field248, this.field242, this.field249, this.field250, 0, var6, var3, this, this.field237, var5);
            } else {
               var2 = method529(0, 0, ((class23)super.field253).field165, var1, this.field243, var2, this.field240, this.field244, 0, var6, var3, this, this.field237, var5);
            }

            this.field245 -= var2;
            if (this.field245 != 0) {
               return var2;
            }

            if (!this.method514()) {
               continue;
            }

            return var4;
         }

         if (this.field237 == -256 && (this.field243 & 255) == 0) {
            if (class25.field199) {
               return method518(0, ((class23)super.field253).field165, var1, this.field243, var2, this.field248, this.field242, 0, var4, var3, this);
            }

            return method580(((class23)super.field253).field165, var1, this.field243, var2, this.field240, 0, var4, var3, this);
         }

         if (class25.field199) {
            return method522(0, 0, ((class23)super.field253).field165, var1, this.field243, var2, this.field248, this.field242, 0, var4, var3, this, this.field237, var5);
         }

         return method521(0, 0, ((class23)super.field253).field165, var1, this.field243, var2, this.field240, 0, var4, var3, this, this.field237, var5);
      }
   }

   boolean method514() {
      int var1 = this.field238;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method585(var1, this.field239);
         var3 = method560(var1, this.field239);
      }

      if (this.field240 == var1 && this.field248 == var2 && this.field242 == var3) {
         if (this.field238 == Integer.MIN_VALUE) {
            this.field238 = 0;
            this.field242 = 0;
            this.field248 = 0;
            this.field240 = 0;
            this.remove();
            return true;
         } else {
            this.method494();
            return false;
         }
      } else {
         if (this.field240 < var1) {
            this.field244 = 1;
            this.field245 = var1 - this.field240;
         } else if (this.field240 > var1) {
            this.field244 = -1;
            this.field245 = this.field240 - var1;
         } else {
            this.field244 = 0;
         }

         if (this.field248 < var2) {
            this.field249 = 1;
            if (this.field245 == 0 || this.field245 > var2 - this.field248) {
               this.field245 = var2 - this.field248;
            }
         } else if (this.field248 > var2) {
            this.field249 = -1;
            if (this.field245 == 0 || this.field245 > this.field248 - var2) {
               this.field245 = this.field248 - var2;
            }
         } else {
            this.field249 = 0;
         }

         if (this.field242 < var3) {
            this.field250 = 1;
            if (this.field245 == 0 || this.field245 > var3 - this.field242) {
               this.field245 = var3 - this.field242;
            }
         } else if (this.field242 > var3) {
            this.field250 = -1;
            if (this.field245 == 0 || this.field245 > this.field242 - var3) {
               this.field245 = this.field242 - var3;
            }
         } else {
            this.field250 = 0;
         }

         return false;
      }
   }

   static int method515(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class30 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field243 = var2 << 8;
      return var3;
   }

   static int method516(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class30 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field243 = var3 << 8;
      return var4 >> 1;
   }

   static int method580(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class30 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field243 = var2 << 8;
      return var3;
   }

   static int method518(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class30 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field243 = var3 << 8;
      return var4 >> 1;
   }

   static int method519(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class30 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field243 = var4;
      return var5;
   }

   static int method520(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class30 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field243 = var4;
      return var5 >> 1;
   }

   static int method521(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class30 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field243 = var4;
      return var5;
   }

   static int method522(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class30 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field243 = var4;
      return var5 >> 1;
   }

   static int method523(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class30 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field248 += var9.field249 * (var6 - var3);
      var9.field242 += var9.field250 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field240 = var4 >> 2;
      var9.field243 = var2 << 8;
      return var3;
   }

   static int method524(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class30 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field240 += var12.field244 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field248 = var5 >> 2;
      var12.field242 = var6 >> 2;
      var12.field243 = var3 << 8;
      return var4 >> 1;
   }

   static int method525(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class30 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field248 += var9.field249 * (var6 - var3);
      var9.field242 += var9.field250 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field240 = var4 >> 2;
      var9.field243 = var2 << 8;
      return var3;
   }

   static int method526(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class30 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field240 += var12.field244 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field248 = var5 >> 2;
      var12.field242 = var6 >> 2;
      var12.field243 = var3 << 8;
      return var4 >> 1;
   }

   static int method527(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class30 var11, int var12, int var13) {
      var11.field248 -= var11.field249 * var5;
      var11.field242 -= var11.field250 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field248 += var11.field249 * var5;
      var11.field242 += var11.field250 * var5;
      var11.field240 = var6;
      var11.field243 = var4;
      return var5;
   }

   static int method528(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class30 var13, int var14, int var15) {
      var13.field240 -= var13.field244 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field240 += var13.field244 * var5;
      var13.field248 = var6;
      var13.field242 = var7;
      var13.field243 = var4;
      return var5;
   }

   static int method529(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class30 var11, int var12, int var13) {
      var11.field248 -= var11.field249 * var5;
      var11.field242 -= var11.field250 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field248 += var11.field249 * var5;
      var11.field242 += var11.field250 * var5;
      var11.field240 = var6;
      var11.field243 = var4;
      return var5;
   }

   static int method492(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class30 var13, int var14, int var15) {
      var13.field240 -= var13.field244 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field240 += var13.field244 * var5;
      var13.field248 = var6;
      var13.field242 = var7;
      var13.field243 = var4;
      return var5;
   }
}
