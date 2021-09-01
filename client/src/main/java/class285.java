public class class285 {
   static int plane;
   String field3649;
   String field3651;
   public final class286 field3647;
   public final int field3648;
   public final long field3646;

   public static int method4566(int var0) {
      long var3 = class208.field2485[var0];
      int var2 = (int)(var3 >>> 7 & 127L);
      return var2;
   }

   class285(Buffer var1, byte var2, int var3) {
      this.field3651 = var1.readStringNullTerminated();
      this.field3649 = var1.readStringNullTerminated();
      this.field3648 = var1.readUnsignedShort();
      this.field3646 = var1.method5954();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.field3647 = new class286();
      this.field3647.method4571(2);
      this.field3647.method4572(var2);
      this.field3647.field3656 = var4;
      this.field3647.field3653 = var5;
      this.field3647.field3657 = 0;
      this.field3647.field3659 = 0;
      this.field3647.field3654 = var3;
   }

   public String method4557() {
      return this.field3651;
   }

   public String method4558() {
      return this.field3649;
   }

   static int method4562(int var0, class59 var1, boolean var2) {
      if (3600 == var0) {
         if (class13.field80.field714 == 0) {
            class51.field747[++class51.field746 - 1] = -2;
         } else if (class13.field80.field714 == 1) {
            class51.field747[++class51.field746 - 1] = -1;
         } else {
            class51.field747[++class51.field746 - 1] = class13.field80.field712.method5200();
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3601) {
            var4 = class51.field747[--class51.field746];
            if (class13.field80.method1362() && var4 >= 0 && var4 < class13.field80.field712.method5200()) {
               class321 var8 = (class321)class13.field80.field712.method5196(var4);
               class51.field738[++class2.field4 - 1] = var8.method5155();
               class51.field738[++class2.field4 - 1] = var8.method5156();
            } else {
               class51.field738[++class2.field4 - 1] = "";
               class51.field738[++class2.field4 - 1] = "";
            }

            return 1;
         } else if (3602 == var0) {
            var4 = class51.field747[--class51.field746];
            if (class13.field80.method1362() && var4 >= 0 && var4 < class13.field80.field712.method5200()) {
               class51.field747[++class51.field746 - 1] = ((class328)class13.field80.field712.method5196(var4)).field3865;
            } else {
               class51.field747[++class51.field746 - 1] = 0;
            }

            return 1;
         } else if (3603 == var0) {
            var4 = class51.field747[--class51.field746];
            if (class13.field80.method1362() && var4 >= 0 && var4 < class13.field80.field712.method5200()) {
               class51.field747[++class51.field746 - 1] = ((class328)class13.field80.field712.method5196(var4)).field3866;
            } else {
               class51.field747[++class51.field746 - 1] = 0;
            }

            return 1;
         } else {
            String var9;
            if (var0 == 3604) {
               var9 = class51.field738[--class2.field4];
               int var7 = class51.field747[--class51.field746];
               class322.method5133(var9, var7);
               return 1;
            } else if (3605 == var0) {
               var9 = class51.field738[--class2.field4];
               class13.field80.method1326(var9);
               return 1;
            } else if (var0 == 3606) {
               var9 = class51.field738[--class2.field4];
               class13.field80.method1330(var9);
               return 1;
            } else if (var0 == 3607) {
               var9 = class51.field738[--class2.field4];
               class13.field80.method1384(var9);
               return 1;
            } else if (3608 == var0) {
               var9 = class51.field738[--class2.field4];
               class13.field80.method1370(var9);
               return 1;
            } else if (3609 == var0) {
               var9 = class51.field738[--class2.field4];
               var9 = class53.method1535(var9);
               class51.field747[++class51.field746 - 1] = class13.field80.method1324(new class406(var9, class52.field761), false) ? 1 : 0;
               return 1;
            } else if (3611 == var0) {
               if (class69.field972 != null) {
                  class51.field738[++class2.field4 - 1] = class69.field972.field3834;
               } else {
                  class51.field738[++class2.field4 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (class69.field972 != null) {
                  class51.field747[++class51.field746 - 1] = class69.field972.method5200();
               } else {
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var4 = class51.field747[--class51.field746];
               if (class69.field972 != null && var4 < class69.field972.method5200()) {
                  class51.field738[++class2.field4 - 1] = class69.field972.method5196(var4).method5167().getName();
               } else {
                  class51.field738[++class2.field4 - 1] = "";
               }

               return 1;
            } else if (3614 == var0) {
               var4 = class51.field747[--class51.field746];
               if (class69.field972 != null && var4 < class69.field972.method5200()) {
                  class51.field747[++class51.field746 - 1] = ((class328)class69.field972.method5196(var4)).method5268();
               } else {
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3615) {
               var4 = class51.field747[--class51.field746];
               if (class69.field972 != null && var4 < class69.field972.method5200()) {
                  class51.field747[++class51.field746 - 1] = ((class328)class69.field972.method5196(var4)).field3866;
               } else {
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            } else if (3616 == var0) {
               class51.field747[++class51.field746 - 1] = null != class69.field972 ? class69.field972.field3832 : 0;
               return 1;
            } else if (3617 == var0) {
               var9 = class51.field738[--class2.field4];
               class63.method1660(var9);
               return 1;
            } else if (3618 == var0) {
               class51.field747[++class51.field746 - 1] = null != class69.field972 ? class69.field972.field3837 * 553895809 * -1047234431 : 0;
               return 1;
            } else if (var0 == 3619) {
               var9 = class51.field738[--class2.field4];
               class47.method807(var9);
               return 1;
            } else if (var0 == 3620) {
               class56.method1580();
               return 1;
            } else if (var0 == 3621) {
               if (!class13.field80.method1362()) {
                  class51.field747[++class51.field746 - 1] = -1;
               } else {
                  class51.field747[++class51.field746 - 1] = class13.field80.field713.method5200();
               }

               return 1;
            } else if (var0 == 3622) {
               var4 = class51.field747[--class51.field746];
               if (class13.field80.method1362() && var4 >= 0 && var4 < class13.field80.field713.method5200()) {
                  class327 var5 = (class327)class13.field80.field713.method5196(var4);
                  class51.field738[++class2.field4 - 1] = var5.method5155();
                  class51.field738[++class2.field4 - 1] = var5.method5156();
               } else {
                  class51.field738[++class2.field4 - 1] = "";
                  class51.field738[++class2.field4 - 1] = "";
               }

               return 1;
            } else if (3623 == var0) {
               var9 = class51.field738[--class2.field4];
               var9 = class53.method1535(var9);
               class51.field747[++class51.field746 - 1] = class13.field80.method1325(new class406(var9, class52.field761)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var4 = class51.field747[--class51.field746];
               if (class69.field972 != null && var4 < class69.field972.method5200() && class69.field972.method5196(var4).method5167().equals(MouseHandler.localPlayer.username)) {
                  class51.field747[++class51.field746 - 1] = 1;
               } else {
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3625) {
               if (null != class69.field972 && null != class69.field972.field3833) {
                  class51.field738[++class2.field4 - 1] = class69.field972.field3833;
               } else {
                  class51.field738[++class2.field4 - 1] = "";
               }

               return 1;
            } else if (3626 == var0) {
               var4 = class51.field747[--class51.field746];
               if (class69.field972 != null && var4 < class69.field972.method5200() && ((class323)class69.field972.method5196(var4)).method5134()) {
                  class51.field747[++class51.field746 - 1] = 1;
               } else {
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            } else if (var0 != 3627) {
               if (var0 == 3628) {
                  class13.field80.field712.method5249();
                  return 1;
               } else {
                  boolean var6;
                  if (3629 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class390(var6));
                     return 1;
                  } else if (3630 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class391(var6));
                     return 1;
                  } else if (3631 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class93(var6));
                     return 1;
                  } else if (3632 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class89(var6));
                     return 1;
                  } else if (var0 == 3633) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class92(var6));
                     return 1;
                  } else if (3634 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class97(var6));
                     return 1;
                  } else if (var0 == 3635) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class91(var6));
                     return 1;
                  } else if (3636 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class90(var6));
                     return 1;
                  } else if (3637 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class94(var6));
                     return 1;
                  } else if (3638 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new UserComparator10(var6));
                     return 1;
                  } else if (var0 == 3639) {
                     class13.field80.field712.method5197();
                     return 1;
                  } else if (var0 == 3640) {
                     class13.field80.field713.method5249();
                     return 1;
                  } else if (3641 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field713.method5239(new class390(var6));
                     return 1;
                  } else if (3642 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field713.method5239(new class391(var6));
                     return 1;
                  } else if (var0 == 3643) {
                     class13.field80.field713.method5197();
                     return 1;
                  } else if (3644 == var0) {
                     if (class69.field972 != null) {
                        class69.field972.method5249();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (null != class69.field972) {
                        class69.field972.method5239(new class390(var6));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (null != class69.field972) {
                        class69.field972.method5239(new class391(var6));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (null != class69.field972) {
                        class69.field972.method5239(new class93(var6));
                     }

                     return 1;
                  } else if (3648 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (null != class69.field972) {
                        class69.field972.method5239(new class89(var6));
                     }

                     return 1;
                  } else if (3649 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (null != class69.field972) {
                        class69.field972.method5239(new class92(var6));
                     }

                     return 1;
                  } else if (3650 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (null != class69.field972) {
                        class69.field972.method5239(new class97(var6));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (null != class69.field972) {
                        class69.field972.method5239(new class91(var6));
                     }

                     return 1;
                  } else if (3652 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (null != class69.field972) {
                        class69.field972.method5239(new class90(var6));
                     }

                     return 1;
                  } else if (3653 == var0) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (class69.field972 != null) {
                        class69.field972.method5239(new class94(var6));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (class69.field972 != null) {
                        class69.field972.method5239(new UserComparator10(var6));
                     }

                     return 1;
                  } else if (3655 == var0) {
                     if (null != class69.field972) {
                        class69.field972.method5197();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var6 = class51.field747[--class51.field746] == 1;
                     class13.field80.field712.method5239(new class96(var6));
                     return 1;
                  } else if (var0 == 3657) {
                     var6 = class51.field747[--class51.field746] == 1;
                     if (null != class69.field972) {
                        class69.field972.method5239(new class96(var6));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = class51.field747[--class51.field746];
               if (null != class69.field972 && var4 < class69.field972.method5200() && ((class323)class69.field972.method5196(var4)).method5139()) {
                  class51.field747[++class51.field746 - 1] = 1;
               } else {
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
