package evcoplus;

import java.util.Scanner;

public class EVSPLUSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EVC PLUS: fadlan geli Codeka gaaban");
        String Codeka_Gaaban = input.nextLine().trim().toLowerCase();

        if (Codeka_Gaaban.equals("*770#")) {
            System.out.println("Fadlan gali pinkaaga (Enter PIN)");
            String numberPin = input.nextLine();
            String correctPin = "6098";

            if (numberPin.equals(correctPin)) {
                System.out.println("Fadlan dooro adeegga (1-8): ");
                System.out.println("1. Itus haraageyga");
                System.out.println("2. Kaarka hadalka");
                System.out.println("3. Bixi biilka");
                System.out.println("4. U wareeji EVC-Plus");
                System.out.println("5. Warbixin Kooban");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Maareynta");
                System.out.println("8. Xirmooyinka Hormuud Bixiso");

                int Dooro = input.nextInt();
                double Haraagaga = 10;

                // Qaybta Switch
                switch (Dooro) {
                    case 1:
                        System.out.println("Haraagaga waa $" + Haraagaga);
                        break;

                    case 2:
                        System.out.println("Kaarka Hadalka");
                        System.out.println("1. Ku shubo Airtime");
                        System.out.println("2. Ugu shub Airtime");
                        System.out.println("3. MIFI Packages");
                        System.out.println("4. Ku shubo Internet");
                        System.out.println("5. Ugu shub qof kale");

                        int num1 = input.nextInt();

                        if (num1 == 1) {
                            System.out.println("Fadlan geli lacagta:");
                            double amount1 = input.nextDouble();
                            System.out.println("Ma hubtaa inaad $" + amount1 + " ku shubato?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int submit1 = input.nextInt();

                            if (submit1 == 1) {
                                System.out.println("Waad ku guuleysatay inaad $" + amount1 + " ku shubato.");
                            } else {
                                System.out.println("Waanu ka xunahay, kamaadan shubin lacag.");
                            }

                        } else if (num1 == 2) {
                            System.out.println("Geli nambarka qofka aad ugu shubayso:");
                            String number = input.next();
                            System.out.println("Geli lacagta:");
                            double amount2 = input.nextDouble();
                            System.out.println("Ma hubtaa inaad $" + amount2 + " ugu shubto " + number + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirm = input.nextInt();

                            if (confirm == 1) {
                                System.out.println("Waad ugu shubtay $" + amount2 + " nambarka " + number);
                            } else {
                                System.out.println("Ugu shubis lama fulin.");
                            }

                        } else if (num1 == 3) {
                            System.out.println("Dooro MIFI Package:");
                            System.out.println("1. 5GB - $5");
                            System.out.println("2. 10GB - $9");
                            int mifiOption = input.nextInt();

                            if (mifiOption == 1) {
                                System.out.println("Waad dooratay 5GB. Ma rabtaa inaad ku shubato $5?");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                int mifiConfirm = input.nextInt();

                                if (mifiConfirm == 1) {
                                    System.out.println("Waad ku shubtay 5GB MIFI.");
                                } else {
                                    System.out.println("MIFI lama shubin.");
                                }

                            } else if (mifiOption == 2) {
                                System.out.println("Waad dooratay 10GB. Ma rabtaa inaad ku shubato $9?");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                int mifiConfirm2 = input.nextInt();

                                if (mifiConfirm2 == 1) {
                                    System.out.println("Waad ku shubtay 10GB MIFI.");
                                } else {
                                    System.out.println("MIFI lama shubin.");
                                }
                            } else {
                                System.out.println("Xulasho aan sax ahayn.");
                            }

                        } else if (num1 == 4) {
                            System.out.println("Geli qadarka internet-ka ($):");
                            double netAmount = input.nextDouble();
                            System.out.println("Ma rabtaa inaad $" + netAmount + " ku shubto internet?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int netConfirm = input.nextInt();

                            if (netConfirm == 1) {
                                System.out.println("Internet ayaa lagu shubay $" + netAmount);
                            } else {
                                System.out.println("Internet lama shubin.");
                            }

                        } else if (num1 == 5) {
                            System.out.println("Geli nambarka qofka kale:");
                            String otherNumber = input.next();
                            System.out.println("Geli qadarka aad ugu shubeyso:");
                            double otherAmount = input.nextDouble();
                            System.out.println("Ma rabtaa inaad $" + otherAmount + " ugu shubto " + otherNumber + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int otherConfirm = input.nextInt();

                            if (otherConfirm == 1) {
                                System.out.println("Waad ugu shubtay $" + otherAmount + " nambarka " + otherNumber);
                            } else {
                                System.out.println("Ugu shubid lama fulin.");
                            }

                        } else {
                            System.out.println("Fadlan dooro mid sax ah (1-5).");
                        }

                        break;

                    case 3:
                        System.out.println("Bixi Biilka");
                        double Bill_Balance = 25;
                        System.out.println("Fadlan dooro:");
                        System.out.println("1. Boostada la bixiyay");
                        System.out.println("2. Ku iibso");

                        int Bill_Options = input.nextInt();

                        if (Bill_Options == 1) {
                            System.out.println("Boostada la bixiyay:");
                            System.out.println("1. Ogow Biil-ka");
                            System.out.println("2. Bixi Biilka");
                            System.out.println("3. Ka bixi biilka");

                            int PostPaid_Options = input.nextInt();

                            if (PostPaid_Options == 1) {
                                System.out.println("Haraaga Bill-kaagu waa $" + Bill_Balance);

                            } else if (PostPaid_Options == 2) {
                                System.out.println("Fadlan Geli Lacagta:");
                                double Bixi_biilka = input.nextDouble();
                                System.out.println("Ma hubtaa inaad bixisid Bill lacagtisu ay tahay $" + Bixi_biilka + "? (1. Haa 2. Maya)");
                                int Bixi_biilka_YesOrNo = input.nextInt();

                                if (Bixi_biilka_YesOrNo == 1) {
                                    if (Bixi_biilka <= Bill_Balance) {
                                        System.out.println("Waxaad bixisay Bill lacagatisu ay tahay $" + Bixi_biilka + ". Mahadsanid.");
                                    } else {
                                        System.out.println("Waa ka xumahay, lacagtaada kuma filna bixinta bill-ka.");
                                    }
                                } else {
                                    System.out.println("Bixinta waa la joojiyay. Mahadsanid.");
                                }

                            } else if (PostPaid_Options == 3) {
                                System.out.println("Ka bixi Bill");
                                System.out.println("Fadlan Geli Mobile-ka:");
                                int Mobile_number = input.nextInt();
                                System.out.println("Fadlan Geli Lacagta:");
                                double Lacagta = input.nextDouble();

                                if (Lacagta > Bill_Balance) {
                                    System.out.println("Haraagaagu Bill-ka kuguma filna.");
                                } else {
                                    System.out.println("Ma hubtaa inaad bixisid Bill lacagtisu tahay $" + Lacagta + " oolaga rabo tel no " + Mobile_number + "? (1. Haa 2. Maya)");
                                    int Bill_YesOrNo = input.nextInt();

                                    if (Bill_YesOrNo == 1) {
                                        System.out.println("Waxaad bixisay bill lacagtisu ay tahay $" + Lacagta + " kana dirtay " + Mobile_number);
                                    } else {
                                        System.out.println("Bixinta waa la joojiyay. Mahadsanid.");
                                    }
                                }

                            } else {
                                System.out.println("Fadlan dooro xulasho sax ah (1-3).");
                            }

                        } else if (Bill_Options == 2) {
                            System.out.println("Ku iibso");
                            System.out.println("Fadlan geli aqoonsiga:");
                            int Aqoonsiga_Ganacsiga = input.nextInt();
                            System.out.println("Fadlan Geli Lacagta:");
                            double LacagtataAqonsiga = input.nextDouble();

                            if (LacagtataAqonsiga > Bill_Balance) {
                                System.out.println("Waa ka xumahay, lacagtaada kuma filna.");
                            } else {
                                System.out.println("Ma hubtaa inaad ku iibsatid $" + LacagtataAqonsiga + " kana iibsatid ganacsiga " + Aqoonsiga_Ganacsiga + "? (1. Haa 2. Maya)");
                                int submit_YesOrNo = input.nextInt();

                                if (submit_YesOrNo == 1) {
                                    double NewBill_Balance = Bill_Balance - LacagtataAqonsiga;
                                    System.out.println("Waxaad ku iibsatay $" + LacagtataAqonsiga + " kana iibsatay ganacsiga " + Aqoonsiga_Ganacsiga);
                                    System.out.println("Haraagaaga cusub waa $" + NewBill_Balance);
                                } else {
                                    System.out.println("Iibsiga waa la joojiyay. Mahadsanid.");
                                }
                            }

                        } else {
                            System.out.println("Fadlan dooro 1 ama 2.");
                        }

                        break;

                    case 4:
                        System.out.println("Uwareeji EVCPlus");
                        System.out.println("Fadlan Geli Mobileka: ");
                        int Phone_Numberkaan = input.nextInt();

                        if (Phone_Numberkaan <= 0) {
                            System.out.println("Lambarka aad gelisay sax maaha.");
                        } else {
                            System.out.println("Fadlan Geli Lacagta: ");
                            int Sending_Money = input.nextInt();

                            if (Sending_Money <= 0) {
                                System.out.println("Lacagta lama aqbalo, fadlan geli lacag sax ah.");
                            } else if (Sending_Money > Haraagaga) {
                                System.out.println("Waa ka xunahay, haraagaaga kuguma filna lacagta aad rabto inaad dirto.");
                            } else {
                                System.out.println("Ma hubtaa inaad $" + Sending_Money + " u wareejineysid " + Phone_Numberkaan + " \n(1. Haa 2. Maya)");
                                int submit = input.nextInt();
                                double Net_Haraaga = Haraagaga - Sending_Money;

                                if (submit == 1) {
                                    System.out.println("Waxaad $" + Sending_Money + " u wareejineysid " + Phone_Numberkaan + ". Haraagaagu waa $" + Net_Haraaga);
                                } else {
                                    System.out.println("Hawlgalka waa la joojiyay. Mahadsanid.");
                                }
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Warbixin Kooban");
                        System.out.println("Haraagaagu waa $" + Haraagaga);
                        break;

                    case 6:
                        System.out.println("Salaam Bank");
                        System.out.println("Fadlan dooro 1. Haddii aad u baahan tahay xisaab cusub 2. Haddii aad rabto inaad heshid balance.");
                        int bankOption = input.nextInt();
                        if (bankOption == 1) {
                            System.out.println("Xisaabtaada cusub ayaa la sameeyay. Mahadsanid.");
                        } else if (bankOption == 2) {
                            System.out.println("Balance-kaaga ayaa ah: $1000");
                        }
                        break;
                    case 7:
                        System.out.println("Maareynta");
                        System.out.println("1. Bedel Pin-ka");
                        System.out.println("2. Bedel Codeka");
                        System.out.println("Fadlan dooro mid: ");
                        int manageOption = input.nextInt();
                        if (manageOption == 1) {
                            System.out.println("Fadlan geli PIN cusub: ");
                            String newPin = input.nextLine();  // to consume the new line left over
                            newPin = input.nextLine();
                            System.out.println("PIN-kaaga waa la bedelay.");
                        } else if (manageOption == 2) {
                            System.out.println("Fadlan geli code cusub: ");
                            String newCode = input.nextLine();  // to consume the new line left over
                            newCode = input.nextLine();
                            System.out.println("Code-kaaga waa la bedelay.");
                        }
                        break;
                    case 8:
                        System.out.println("Xirmooyinka Hormuud Bixiso");
                        System.out.println("xirmooyin hormuuda ee  anfac");
                        System.out.println("1. Xirmada Hadalka ee Bil kasta");
                        System.out.println("2. Xirmada Internet-ka ee Bil kasta");
                        System.out.println("3. Xirmada MIFI");
                        System.out.println("4. Xirmooyinka Data");
                        System.out.println("5. Xirmooyinka Airtime");
                        int xirmoChoice = input.nextInt();

                        switch (xirmoChoice) {
                            case 1:
                                System.out.println(" Xirmooyinka Anfac Plus:");
                                System.out.println("1. $1 - 2GB + 100 mins + 50 SMS (7 maalmood)");
                                System.out.println("2. $2 - 5GB + 200 mins + 100 SMS (30 maalmood)");
                                System.out.println("3. $5 - 12GB + 500 mins + 150 SMS (30 maalmood)");
                                System.out.println("4. $10 - 28GB + 1000 mins + 2 Intl mins (45 maalmood)");
                                System.out.println("5. $20 - 60GB + 2000 mins + 5 Intl mins (60 maalmood)");
                                System.out.println("6. $50 - 140GB + 5000 mins + 2 Intl mins (90 maalmood)");
                                System.out.print("Dooro xirmada Anfac: ");
                                int anfacChoice = input.nextInt();
                                System.out.println(" Anfac Plus xirmada #" + anfacChoice + " ayaa si guul leh lagu shubay.");
                                break;

                            case 2:
                                System.out.println(" Xirmooyinka Internet-ka (30 maalmood):");
                                System.out.println("1. $1 - 2GB");
                                System.out.println("2. $2 - 5GB");
                                System.out.println("3. $5 - 13GB");
                                System.out.println("4. $10 - 20GB");
                                System.out.println("5. $20 - 90GB");
                                System.out.println("6. $30 - 160GB");
                                System.out.print("Dooro xirmada internet-ka: ");
                                int internetChoice = input.nextInt();
                                System.out.println(" Xirmada Internet #" + internetChoice + " ayaa si guul leh lagu shubay.");
                                break;

                            case 3:
                                System.out.println(" Xirmooyinka MIFI:");
                                System.out.println("1. $2 - 10GB (15 maalmood)");
                                System.out.println("2. $5 - 30GB (30 maalmood)");
                                System.out.println("3. $10 - 75GB (30 maalmood)");
                                System.out.println("4. $20 - 160GB (60 maalmood)");
                                System.out.print("Dooro xirmada MIFI: ");
                                int mifiChoice = input.nextInt();
                                System.out.println(" Xirmada MIFI #" + mifiChoice + " ayaa si guul leh loogu shubay qalabka MIFI.");
                                break;

                            case 4:
                                System.out.println("📡 Xirmooyinka Data Maalinle/Usbuucle:");
                                System.out.println("1. $0.5 - 500MB (3 maalmood)");
                                System.out.println("2. $1 - 1.5GB (7 maalmood)");
                                System.out.println("3. $2 - 3GB (15 maalmood)");
                                System.out.print("Dooro xirmada Data gaaban: ");
                                int dataGaaban = input.nextInt();
                                System.out.println(" Xirmada Data #" + dataGaaban + " ayaa si guul leh lagu shubay.");
                                break;

                            case 5:
                                System.out.print(" Fadlan geli lacagta aad rabto inaad ku shubato Airtime ($1 - $50): ");
                                double airtime = input.nextDouble();
                                if (airtime >= 1 && airtime <= 50) {
                                    System.out.println(" Waxaad ku shubtay $" + airtime + " Airtime. Waad ku mahadsantahay.");
                                } else {
                                    System.out.println("Lacagta waa iney u dhaxeysaa $1 ilaa $50.");
                                }
                                break;

                            default:
                                System.out.println(" Doorasho aan sax ahayn. Fadlan dooro 1 ilaa 5.");
                                break;
                        }
                        break;

                    case 9:
                        System.out.println(" Salaam Bank");
                        System.out.println("1. Fur xisaab cusub");
                        System.out.println("2. Eeg Balance-ka");
                        System.out.println("3. Ku wareeji Salaam Bank");
                        System.out.println("4. Ka bixi lacag Salaam Bank");
                        System.out.print("Dooro adeegga Salaam Bank (1-4): ");
                        int bankChoices = input.nextInt();

                        switch (bankChoices) {
                            case 1:
                                // Code for opening a new account
                                System.out.println("Fur xisaab cusub: Xisaab cusub ayaa la furay!");
                                break;
                            case 2:
                                // Code for checking balance
                                System.out.println("Eeg Balance-ka: Balance-kaaga waa 1000$");
                                break;
                            case 3:
                                // Code for transferring money within Salaam Bank
                                System.out.println("Ku wareeji Salaam Bank: Lacag ayaa lagu wareejiyey!");
                                break;
                            case 4:
                                // Code for withdrawing money from Salaam Bank
                                System.out.println("Ka bixi lacag Salaam Bank: Lacag ayaa laguu bixiyey!");
                                break;
                            default:
                                // Code for invalid selection
                                System.out.println("Fadlan dooro doorasho sax ah (1-4).");
                                break;
                        }
                }
            }

                }
            }
        }