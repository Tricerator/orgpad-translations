(ns orgpad.client.i18n.dicts.cs
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.cs :as cs]
            [orgpad.client.util.unicode :as unicode]))

(def dict
  "A dictionary map from keywords to the corresponding Czech texts."
  (merge
    cs/dict
    {:administration/page-title                       "Administrace – OrgPad"

     :attachments/allows-access-to-file               "Umožnit přístup k tomuto souboru."
     :attachments/allows-access-to-image              "Umožnit přístup k tomuto obrázku."
     :attachments/no-preview                          "Náhled nedostupný"
     :attachments/used-files                          "Soubory v OrgStránce"
     :attachments/unused-files                        "Soubory stranou"
     :attachments/used-images                         "Obrázky v OrgStránce"
     :attachments/unused-images                       "Obrázky stranou"
     :attachments/uploading-files                     "Nahrávání souborů …"
     :attachments/previous-attachment                 "Předchozí soubor nebo obrázek"
     :attachments/next-attachment                     "Následující soubor nebo obrázek"

     :button/back                                     "Zpět"
     :button/cancel                                   "Zrušit"
     :button/close                                    "Zavřít"
     :button/comment                                  "Komentovat"
     :button/copied                                   "Zkopírováno"
     :button/copy                                     "Kopírovat"
     :button/copy-link                                "Kopírovat odkaz"
     :button/create                                   "Vytvořit"
     :button/create-tooltip                           "Vytvořit (CTRL+ENTER)"
     :button/delete                                   "Smazat"
     :button/delete-selected                          "Smazat vybrané"
     :button/documentation                            "Dokumentace"
     :button/download                                 "Stáhnout"
     :button/download-all                             "Stáhnout vše"
     :button/drop                                     "Pustit"
     :button/edit                                     "Upravit"
     :button/import                                   "Importovat"
     :button/insert                                   "Vložit"
     :button/login                                    "Přihlásit"
     :button/logout                                   "Odhlásit"
     :button/publish                                  "Zveřejnit"
     :button/read                                     "Číst"
     :button/register                                 "Registrovat"
     :button/register-to-save                         "Pro uložení registrovat"
     :button/remove                                   "Odstranit"
     :button/reset                                    "Resetovat"
     :button/save                                     "Uložit změny"
     :button/save-tooltip                             "Uložit změny (CTRL+ENTER)"
     :button/upload                                   "Nahrát"
     :button/upload-from-computer                     "Nahrát z počítače"
     :button/send                                     "Poslat"
     :button/present                                  "Prezentovat"
     :button/present-tooltip                          "Začít prezentaci (F5)"
     :button/share                                    "Sdílet"
     :button/start                                    "Start"
     :button/exit                                     "Ukončit"
     :button/show-password                            "Ukázat"
     :button/hide-password                            "Skrýt"

     :checkout/currency                               "Měna"
     :checkout/monthly                                "měsíční"
     :checkout/yearly                                 "roční (ušetříte 15 %)"
     :checkout/failed-to-init                         "Při nahrávání webové stránky pokladny nastala chyba."
     :checkout/upgrade-plan                           "Povyšte předplatné"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "Škola"] " nebo "
                                                         [:a.link-button {:href enterprise-url} "firma"] "? Kontaktujte nás a získejte nabídku na míru."])
     :checkout/pay-with-credit-card                   "Platba kartou"
     :checkout/pay-with-wire-transfer                 "Platba převodem"
     :checkout/promo-code                             "Promo kód"
     :checkout/try-for-free                           "Zkusit zdarma"
     :checkout/activate-now                           "Aktivovat nyní"
     :checkout/continue-for-free                      "Pokračovat zdarma"

     :consent/title                                   "Používání cookies v OrgPadu"
     :consent/text                                    (fn [{:consent/keys [terms-and-conditions privacy-policy]}]
                                                        [:<> "Používáním této stránky souhlasíte s "
                                                         [:a.link-button terms-and-conditions "pravidly a podmínkami"]
                                                         " společnosti OrgPad a se "
                                                         [:a.link-button privacy-policy "zásadami ochrany osobních údajů"]
                                                         ". Pro určitou funkcionalitu, kterou usnadňujeme práci uživatelům OrgPadu, využíváme cookies."])

     :dashboard/confirm-delete                        [:<> [:b "Trvale"] " smazat tuto OrgStránku?"]
     :dashboard/login-needed                          (fn [{:dashboard/keys [login-url register-url]}]
                                                        [:<> "Abyste mohli vytvořit novou OrgStránku, "
                                                         [:a {:href login-url} "přihlaste se"] " nebo "
                                                         [:a {:href register-url} "se registrujte"] "."])
     :dashboard/org-subscription-expired              (fn [{:dashboard/keys [info-link]
                                                            :org/keys       [name subscription-expired]}]
                                                        [:<> "Předplatné Vaší školy " name " vypršelo dne " subscription-expired ". "
                                                         "Pro obnovu kontaktujte vedení. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Více informací"] " o 95% slevě pro školy."])
     :dashboard/school-subscription-info              (fn [{:dashboard/keys [info-link]}]
                                                        [:<> "Získejte pro svoji školu OrgPad bez limitů s 95% slevou. "
                                                         [:a {:href   info-link
                                                              :target "_blank"} "Více informací."]])
     :dashboard/owned-orgpages                        "Moje"
     :dashboard/public-orgpages                       "Veřejné OrgStránky"
     :dashboard/shared-orgpages                       "Sdílené se mnou"
     :dashboard/usergroup-orgpages                    "Tým {usergroup/name}"
     :dashboard/public-permission-view                "Sdílená s každým pro čtení"
     :dashboard/public-permission-comment             "Sdílená s každým pro komentování"
     :dashboard/public-permission-edit                "Sdílená s každým pro úpravy"
     :dashboard/help-or-inspiration-button            "Tady je!"

     :dashboard-filter/filter                         "Filtrování OrgStránek"
     :dashboard-filter/ordering                       "Řazení OrgStránek"
     :dashboard-filter/filter-and-ordering            "Filtrování a řazení OrgStránek"
     :dashboard-filter/title                          "Filtrování a uspořádání zobrazených OrgStránek"
     :dashboard-filter/ordering-label                 "Řazení OrgStránek"
     :dashboard-filter/title-order                    "Abecedně podle názvu"
     :dashboard-filter/creation-time-order            "Nejnovější nahoře"
     :dashboard-filter/last-modified-order            "Naposledy změněné nahoře"
     :dashboard-filter/most-viewed-order              "Nejvíce prohlížené nahoře"
     :dashboard-filter/search-tags                    "Vyhledávání štítků"

     :embedding-code/code                             "Kód"
     :embedding-code/description                      "Vložte OrgStránku do webové stránky nebo jiné aplikace."

     :error/orgpage-access-denied                     "K této OrgStránce nemáte přístup. Zkuste se přihlásit."
     :error/usergroup-access-denied                   "Zamítnuta práva k editaci týmu."
     :error/administration-access                     "Administrátorský přístup zamítnut."
     :error/creation-unauthorized                     "Pro vytvoření OrgStránky se přihlaste."
     :error/deleting-denied                           "Smazání OrgStránky zamítnuto."
     :error/email-already-used                        "E-mail už se používá."
     :error/email-not-registered                      "Žádný účet s tímto e-mailem."
     :error/email-missing-mx-record                   "E-mailový server na doméně nenalezen."
     :error/email-invalid                             "Není e-mail."
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Chybná OrgStránka" (when id " {orgpage/id}")
                                                             ". Špatně zkopírovaný odkaz?"))
     :error/incorrect-link                            "Chybný odkaz. Buď se přihlaste, nebo otevřete správný odkaz."
     :error/incorrect-password                        "Nesprávné heslo"
     :error/incorrect-profile-id                      "Chybný odkaz na profil. Špatně zkopírovaný odkaz?"
     :error/lost-permission                           "Ztracený přístup k této OrgStránce."
     :error/missing-emails                            (fn [{:missing-emails/keys [emails]}]
                                                        (str "E-maily bez účtu: " emails))
     :error/name-already-used                         "Jméno se již používá."
     :error/name-not-valid                            "Použijte alespoň 5 znaků."
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "OrgStránka " (when title "„{orgpage/title}“")
                                                             " byla odstraněna."))
     :error/owner-of-orgpage                          "Už je vlastníkem OrgStránky."
     :error/profile-not-found                         "Profil nenalezen."
     :error/unknown-error                             "Neznámá chyba, zkuste to znovu."
     :error/unknown-id                                "Neznámá OrgStránka."
     :error/unknown-login-or-email                    "Neznámý e-mail nebo login týmu."
     :error/unknown-usergroup                         "Tým byl smazán."
     :error/upload-failed                             "Selhalo nahrávání OrgStránky: \"{orgpage/title}\""

     :feedback/ask-question                           "Položit otázku"
     :feedback/hide-button                            "Trvale skrýt tlačítko"
     :feedback/dialog-title                           "Napište tvůrcům OrgPadu"
     :feedback/description                            [:<> "Pokud potřebujete pomoci nebo máte problém, ozvěte se nám – "
                                                       [:b "tvůrcům OrgPadu"] ". " "Také vítáme nápady na zlepšení. "
                                                       "Odpovíme Vám pomocí e-mailu co nejdříve."]
     :feedback/languages                              "Můžete nám psát česky, anglicky nebo německy."
     :feedback/contact-when-problem-persists          [:<> " Pokud problém přetrvává, kontaktujte nás prosím na "
                                                       [:a {:href  "mailto:support@orgpad.com"
                                                            :class "link-button"} "support@orgpad.com"] "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Převod na účet"
                                                             (when currency
                                                               (str " v " (name currency))) " pro "
                                                             "roční"
                                                             (if (= tier "standard")
                                                               " standardní"
                                                               " profesionální")
                                                             " předplatné"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Napište nám svou " [:b "fakturační adresu"] " a další informace k faktuře."
                                                         " Obratem Vás budeme kontaktovat na Vaší e-mailové adrese " [:b email] "."])
     :feedback/org-plan-title                         (fn [{:feedback/keys [org-type]}]
                                                        (str "Chci si koupit předplatné pro svou " (case org-type
                                                                                                     :feedback/school-plan "školu"
                                                                                                     :feedback/enterprise-plan "firmu"
                                                                                                     "organizaci")))
     :feedback/org-plan                               (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Prostřednictvím tohoto formuláře oslovíte zástupce firmy OrgPad s.r.o."
                                                         " Obratem Vás budeme kontaktovat na Vašem telefonním čísle nebo Vaší e-mailové adrese " [:b email]
                                                         ". Rovněž nám můžete zavolat na "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Povyšte moje předplatné na profesionální předplatné"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Napište nám, jak máme změnit vaše stávající předplatné a další informace."
                                                         " Obratem Vás budeme kontaktovat na Vaší e-mailové adrese " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Změna zúčtovacího období na " (if (= period "yearly")
                                                                                              "roční"
                                                                                              "měsíční") " vyúčtování"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "Změna proběhne po skončení aktuálního zúčtovacího období."
                                                         " Při ročním vyúčtování získáte slevu 15 %."
                                                         " Obratem Vás budeme kontaktovat na Vaší e-mailové adrese " [:b email] "."])
     :feedback/org-name                               (fn [{:feedback/keys [org-type]}]
                                                        (str "Jméno " (case org-type
                                                                        :feedback/school-plan "školy"
                                                                        :feedback/enterprise-plan "firmy"
                                                                        "organizace")))
     :feedback/position-within-org                    (fn [{:feedback/keys [org-type]}]
                                                        (str "Pozice v rámci " (case org-type
                                                                                 :feedback/school-plan "školy"
                                                                                 :feedback/enterprise-plan "firmy"
                                                                                 "organizace")))
     :feedback/org-website                            (fn [{:feedback/keys [org-type]}]
                                                        (str "Webová stránka " (case org-type
                                                                                 :feedback/school-plan "školy"
                                                                                 :feedback/enterprise-plan "firmy"
                                                                                 "organizace")))

     :help-screen/units-with-shadows                  "Buňky se stíny se jedním kliknutím otevírají a zavírají."
     :help-screen/flat-units                          "Nevystouplé buňky nemají uvnitř žádný obsah navíc"

     :help-screen/more-pages                          "Více stránek je znázorněno pomocí koleček na spodu buňky."
     :help-screen/click-title-to-close                "Kliknutím na nadpis okamžitě uzavřete buňku."
     :help-screen/click-content-next-page             "Kliknutím na obsah buňky přepnete na další stránku"
     :help-screen/click-bullet-goto-page              "Kliknutím na kolečko přeskočíte přímo na danou stránku."

     :help-screen/create-links                        "Vytvořte spoje buď tažením tlačítka spoje, nebo kliknutím na tlačítko a potom kliknutím na cíl."
     :help-screen/create-unit-by-dragging-link        "Vytvoření spoje v prázdném prostoru vytvoří v daném místě novou buňku."

     :help-screen/how-to-view                         "Jak číst"
     :help-screen/opening-units                       "Otevírání buněk"
     :help-screen/moving-pages                        "Více stránek"

     :help-screen/how-to-edit                         "Jak upravovat"
     :help-screen/creating-links                      "Vytváření spojů"

     :help-screen/help                                "Pomoc můžete nalézt tady!"

     :info/uploading-attachments                      [:i18n/plural "Nahrávání {info/count} {info/num-files} …"
                                                       {:info/num-files [:info/count "souborů" "souboru" "souborů" "souborů"]}]
     :info/uploading-images                           [:i18n/plural "Nahrávání {info/count} {info/num-images} …"
                                                       {:info/num-images [:info/count "obrázků" "obrázku" "obrázků" "obrázků"]}]
     :info/uploading-images-failed                    (fn [info]
                                                        (if info
                                                          [:i18n/plural "Nahrávání {info/count} {info/num-images} selhalo."
                                                           {:info/num-images [:info/count "obrázků" "obrázku" "obrázků" "obrázků"]}]
                                                          "Nahrávání nejméně jednoho obrázku selhalo."))
     :info/uploading-youtubes-failed                  [:i18n/plural "{info/count} Youtube {info/num-youtubes} nenalezeno."
                                                       {:info/num-youtubes [:info/count "videí" "video" "videa" "videí"]}]
     :info/uploading-attachments-failed               "Nahrávání souborů selhalo."
     :info/presentation-link-copied                   "Zkopírován odkaz k této prezentaci."
     :info/max-orgpages-exceeded                      "Vlastník této OrgStránky nemůže vytvořit další OrgStránku."
     :info/storage-exceeded                           "Vlastníkovi této OrgStránky nezbývá {upload/total-size} pro nahrání těchto souborů."
     :info/attachments-too-large                      (str "Nahrávání {upload/total-size} selhalo."
                                                           " Najednou je možné nahrát nejvýše 500 MB.")
     :info/drop-info                                  "Přetáhněte do jakékoli buňky nebo do šedého plátna, abyste vytvořili novou buňku."

     :import/another-format                           [:<> "Pokud chcete importovat svá stávající data v jiném formátu, kontaktujte nás na "
                                                       [:b "support@orgpad.com"] "."]
     :import/dialog                                   "Importujte svá data"
     :import/google-docs                              "Pokud chcete importovat data z Microsoft Office nebo Google Docs, stačí je vložit ze schránky do OrgStránky."
     :import/supported-formats                        "Teď podporujeme následující formáty:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exportovaný jako .vsdx soubor."]

     :ios/install-info                                "Nainstalujte aplikaci OrgPad"
     :ios/share-button                                "1. Otevřete"
     :ios/add-to-home-screen                          "2. Klepněte"

     :lang/cs                                         "Česky"
     :lang/de                                         "Německy"
     :lang/en                                         "Anglicky"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polsky"
     :lang/ru                                         "Rusky"

     :language-select/lang-tooltip                    (fn [{:language-select/keys [lang-name lang-en-name]}]
                                                        (str lang-name (when lang-en-name (str " (" lang-en-name ")"))))

     :limit/of                                        " z "
     :limit/orgpages                                  " OrgStránek"
     :limit/people                                    " lidí"
     :limit/teams                                     [:i18n/plural "{limit/team-label}"
                                                       {:limit/team-label [:limit/num-teams
                                                                           " týmů" " týmu" " týmů" " týmů"]}]
     :limit/team-members                              " členů"
     :limit/orgpages-tooltip                          (str "V předplatném zdarma je počet OrgStránek omezený."
                                                           " Pro tvoření více OrgStránek přejděte na vyšší předplatné.")
     :limit/shares-tooltip                            (str "Počet lidí, se kterými můžete sdílet tuto OrgStránku přímo, je omezený."
                                                           " Povyšte na profesionální předplatné pro sdílení s neomezeným počtem lidí.")
     :limit/teams-tooltip                             (str "Ve standardním předplatné je počet vlastněných týmů omezený."
                                                           " Povyšte na profesionální předplatné pro vytváření neomezeného počtu týmů.")
     :limit/teams-members-tooltip                     (str "Ve standardním předplatné má každý tým omezený počet členů."
                                                           " Povyšte na profesionální předplatné pro vytváření neomezeně velkých týmů.")
     :limit/attachments-size                          (str "Celková velikost nahraných souborů a obrázků je omezená,"
                                                           " ale může být rozšířena povýšením na vyšší předplatné.")
     :limit/attachments-size-clickable                (str "Celková velikost nahraných souborů a obrázků je omezená."
                                                           "Klikněte pro zvednutí limitu přechodem na vyšší předplatné.")
     :limit/attachments-size-try-out                  (str "Celková velikost všech nahraných souborů a obrázků je omezena."
                                                           " Abyste si zvedli limit na 100 MB, klikněte pro vytvoření účtu.")

     :limits/max-orgpages                             [:i18n/plural "{limit/document-label}"
                                                       {:limit/document-label [:limit/num
                                                                               "dokumentů" "dokument" "dokumenty" "dokumentů"]}]
     :limits/max-storage                              "úložiště"
     :limits/max-teams                                [:i18n/plural "{limit/team-label}"
                                                       {:limit/team-label [:limit/num
                                                                           "týmů" "tým" "týmy" "týmů"]}]
     :limits/of                                       " o"
     :limits/max-team-members                         [:i18n/plural "{limit/member-label}"
                                                       {:limit/member-label [:limit/num
                                                                             "členech" "členu" "členech" "členech"]}]
     :limits/priority-support                         "přednostní podpora"

     :link-panel/flip                                 "Změnit směr"
     :link-panel/insert-unit-in-middle                "Vložit buňku doprostřed"
     :link-panel/delete                               "Smazat spoj"
     :link-panel/change-link-style                    "Změnit styl spoje; podržte SHIFT pro nastavení aktuálního stylu, podržte CTRL pro zkopírování do aktuálního stylu"


     :loading/initial-autoresize                      "Počítání velikostí všech buněk, {loading/num-units} zbývá …"
     :loading/initial-layout                          "Zlepšení počátečního rozložení …"
     :loading/restoring-opened-pages                  "Obnovení pozic otevřených stránek …"
     :loading/getting-orgpage                         "Stahování OrgStránky ze serveru …"
     :loading/getting-dashboard                       "Stahování seznamu dostupných OrgStránek ze serveru …"
     :loading/getting-website                         "Stahování webové stránky ze serveru …"
     :loading/uploading-orgpage                       "Nahrávání OrgStránky na server …"
     :loading/ws-init                                 "Vytváření spojení se serverem …"
     :loading/ws-closed                               "Spojení se serverem uzavřené, pokouším se znovu připojit. Pokud problém přetrvává, obnovte stránku."
     :loading/administration                          "Nahrávání administrativních dat …"
     :loading/profile                                 "Nahrávání profilu …"
     :loading/style                                   "Nahrávání stylů …"
     :loading/start-trial                             "Začínáme 7denní zkušební předplatné …"
     :loading/uploading-attachments                   "Nahrávání příloh na server …"

     :login/continue-with-email                       "Pokračovat s e-mailem"
     :login/continue-with-facebook                    "Pokračovat s Facebookem"
     :login/continue-with-google                      "Pokračovat s Googlem"
     :login/continue-with-microsoft                   "Pokračovat s Microsoftem"
     :login/email-sent                                "E-mail odeslán. Klikněte na odkaz v e-mailu."
     :login/forgotten-password                        "Zapomenuté heslo"
     :login/forgotten-password-email-resent           "E-mail pro obnovení hesla již odeslán."
     :login/forgotten-password-description            "Získejte odkaz pro obnovení hesla e-mailem (platný 24 hodin)."
     :login/forgotten-password-error                  [:<> "Tato e-mailová adresa je blokována Vámi. Buď ji odblokujte kliknutím na Odhlásit odběr v jakémkoliv e-mailu od OrgPadu, nebo nám pošlete e-mail na "
                                                       [:b "support@orgpad.com"]
                                                       " z této e-mailové adresy."]
     :login/go-to-register                            (fn [{:registration/keys [route]}]
                                                        [:<> "Jste nový v OrgPadu? " [:a.link-button {:href route} "Zaregistrujte se"]])
     :login/options                                   "Vyberte si jiný způsob přihlášení"
     :login/send-reset-link                           "Poslat obnovovací odkaz"
     :login/wrong-email-or-password                   "E-mail nebo heslo je nesprávné."

     :meta/orgpage-thumbnail                          "Obrázek OrgStránky "
     :meta/thumbnail-info                             (str "Zvolte si obrázek, který se bude zobrazovat pro tuto OrgStránku. Používá se"
                                                           " v seznamu OrgStránek, při vložení OrgStránky a při sdílení na sociálních sítích.")
     :meta/automatic-screenshot                       "Automaticky generovaný snímek. Obnovuje se pět minut po libovolné změně."
     :meta/custom-thumbnail                           "Vlastní obrázek o velikosti 1360x768."
     :meta/upload-thumbnail                           "Nahrát vlastní obrázek"
     :meta/thumbnail-upload-failed                    "Nahrát obrázek se nepodařilo."
     :meta/description                                "Popis"
     :meta/new-tag                                    "Štítek"
     :meta/info                                       (str "Informace níže pomáhají Vám a ostatním zjistit, o čem je tato OrgStránka. "
                                                           "Štítky můžete v seznamu OrgStránek využít k filtrování.")
     :meta/info-in-share-orgpage                      "Před sdílením této OrgStránky musí být nastavený nadpis."
     :meta/info-move-to-new-orgpage                   [:i18n/plural (str "Přesunout vybraných {selection/num-units} {selection/units-label} "
                                                                         "a {selection/num-links} {selection/links-label} do nové OrgStránky "
                                                                         "s následujícími informacemi. V současné OrgStránce budou tyto buňky a spoje nahrazeny "
                                                                         "jedinou buňkou, která bude uvnitř obsahovat nově vytvořenou OrgStránku.")
                                                       {:selection/units-label [:selection/num-units "buněk" "buňku" "buňky" "buněk"]
                                                        :selection/links-label [:selection/num-links "spojů" "spoj" "spoje" "spojů"]}]
     :meta/move-to-new-orgpage-title                  "Přesunout do {meta/title}"
     :meta/move-to-new-orgpage                        "Přesunout do nové OrgStránky"

     :notes/create-note                               "Nová poznámka"
     :notes/edit-note                                 "Upravit poznámku"
     :notes/manage-notes                              "Spravovat poznámky"
     :notes/my-notes                                  "Moje poznámky"
     :notes/notes                                     [:i18n/plural "{notes/num-notes} {notes/notes-label}"
                                                       {:notes/notes-label [:notes/num-notes
                                                                            "poznámek" "poznámka" "poznámky" "poznámek"]}]
     :notes/untitled                                  "Poznámka bez názvu"
     :notes/confirm-delete                            "Smazat tuto poznámku?"
     :notes/notes-description                         "Zachyťte své nápady a uspořádejte je později."

     :notifications/info                              "Zvolte, které e-maily Vám OrgPad bude zasílat. O důležitých změnách Vás budeme vždy informovat."
     :notifications/any-email                         "Jakýkoliv e-mail od OrgPadu"
     :notifications/email-verification                "Ověření e-mailu při registraci, odkazy pro obnovení hesla a důležité informace o platbách"
     :notifications/monthly-newsletter                "Měsíční zpravodaj s novinkami a nedávným vývojem v OrgPadu"
     :notifications/messages                          "Dostávejte zprávy od ostatních lidí"
     :notifications/blocked-people                    "Výslovně zablokovaní lidé:"
     :notifications/receipts                          "Účty při automatickém obnovení předplatného"
     :notifications/receive-invitations               "Dostávejte pozvánky od ostatních lidí"
     :notifications/unblock-user                      "Odblokujte tuto osobu."

     :onboarding/openable-units                       "Otevřít lze pouze vyvýšené buňky se stíny."
     :onboarding/zoom                                 "Přibližujte se kolečkem myši"
     :onboarding/drag-canvas                          "Pohybujte se taháním"
     :onboarding/open-units                           "Buňky se stíny mají obsah"

     :orgpage/change-information                      "Změnit informace"
     :orgpage/copy-orgpage                            "Kopírovat do nové OrgStránky"
     :orgpage/delete-orgpage                          "Smazat OrgStránku"
     :orgpage/detail                                  "Podrobnosti"
     :orgpage/share-tooltip                           "Sdílejte tuto OrgStránku s ostatními"
     :orgpage/share-orgpage                           "Sdílení OrgStránky"
     :orgpage/show-information                        "Zobrazit informace"

     :orgpage/zoom-in                                 "Přiblížení"
     :orgpage/zoom-out                                "Oddálení"
     :orgpage/create-unit-double-click                "Dvojklikem vytvořte buňku."
     :orgpage/create-unit-hold-or-double-tap          "Držením nebo dvojitým poklepáním vytvořte buňku."
     :orgpage/switch-to-edit                          "Přepnout na úpravy"

     :orgpage/untitled                                "OrgStránka bez názvu"
     :orgpage/title                                   "Název OrgStránky"
     :orgpage/untitled-unit                           "Nepojmenovaná jednotka"
     :orgpage/untitled-path                           "Nepojmenovaná prezentace"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "kroků" "krok" "kroky" "kroků"]}]

     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (stránka {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (stránka {orgpage/closed-index} → {orgpage/opened-index})"
     :orgpage/copy-done                               (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Kopie je dostupná jako "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])
     :orgpage/change-color                            "Změnit barvu této OrgStránky"
     :orgpage/autoshare                               (fn [{:user/keys [label permission on-click]}]
                                                        [:<> "Tato OrgStránka je automaticky sdílena s " label " pro "
                                                         (case permission
                                                           :permission/view "čtení"
                                                           :permission/comment "komentování"
                                                           :permission/edit "editování"
                                                           nil)
                                                         ". " [:span.link-button {:on-click on-click} "Klikněte zde"]
                                                         " pro zrušení sdílení."])

     :orgpage-placement/activate                      "Prohlížet zde"

     :orgpage-stats/number-of-units                   "Počet buněk"
     :orgpage-stats/number-of-links                   "Počet spojů"
     :orgpage-stats/number-of-files                   "Počet souborů"
     :orgpage-stats/number-of-images                  "Počet obrázků"

     :org-role/student                                "Žák"
     :org-role/teacher                                "Učitel"
     :org-role/employee                               "Zaměstnanec"
     :org-role/admin                                  "Správce"

     :panel/create-orgpage                            "Nová OrgStránka"
     :panel/logo-tooltip                              "Jít na hlavní stránku"
     :panel/edit-info                                 "Přepnout na úpravy, kde můžete vytvářet a mazat buňky a spoje, upravit obsah a další (F7)"
     :panel/comment-info                              (str "Přepnout na komentování, kde můžete vytvářet, upravovat a mazat"
                                                           " vlastní buňky, ale nemůžete upravovat a mazat buňky cizí."
                                                           " Přesto můžete vytvářet spoje k cizím buňkám. (F7)")
     :panel/read-info                                 "Přepnout na čtení, kde nic nemůže být změněno, ale procházení obsahu je jednodušší (F6)"
     :panel/undo-deletion                             "Vrátit smazání"
     :panel/undo-deletion-info                        [:i18n/plural "Vrátit smazání {delete/num-units} {delete/unit-label} a {delete/num-links} {delete/link-label} (CTRL+Z)."
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "buněk" "buňky" "buněk" "buněk"]
                                                                :link-label [:delete/num-links
                                                                             "spojů" "spoje" "spojů" "spojů"]}]
     :panel/refresh                                   "Obnovit"
     :panel/switch-style                              "Přepnout styl nových buněk a spojů; táhnutím vyrobit novou buňku"
     :panel/profile                                   "Profil"
     :panel/settings                                  "Nastavení"
     :panel/usergroups                                "Týmy"
     :panel/stats                                     "Statistiky"
     :panel/administration                            "Administrace"
     :panel/ios-install-info                          "Nainstalovat aplikaci"
     :panel/upload-attachment                         "Vložte obrázky nebo soubory do nových buněk"
     :panel/selection-mode                            "Začít výběr"
     :panel/search                                    "Vyhledávání"

     :password/too-short                              "Alespoň 8 znaků"
     :password/different-passwords                    "Hesla se neshodují"

     :password-reset/back-to-list                     "Zpět na seznam"
     :password-reset/change-password                  "Změnit heslo"
     :password-reset/set-password                     "Nastavit heslo"
     :password-reset/has-password                     "Váš účet má nastavené heslo."
     :password-reset/without-password                 "Žádné heslo není zatím nastavené, protože jste k přihlášení využili propojené účty."
     :password-reset/invalid-link                     "Neplatný odkaz, možná je starší než 24 hodin. Prosím požádejte o opětovné zaslání e-mailu."
     :password-reset/description                      "Nastavte nové heslo"
     :password-reset/enter-current-and-new-password   "Vložte současné heslo a dvakrát nové heslo."
     :password-reset/enter-new-password-twice         "Vložte dvakrát nové heslo."

     :path/add-step                                   "Přidat krok"
     :path/add-step-tooltip                           "Podržte SHIFT pro zkopírování kamery"
     :path/title                                      "Prezentace {path/num-paths}"
     :path/hidden-ops                                 " a {path/num-hidden} dalších"
     :paths/create-new-path                           "Vytvořit prezentaci"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Smazat prezentaci " [:b title] " ?"])

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Aktuální " [:b tier] " předplatné je platné do " [:b end-date] "."
                                                         (if autorenewal
                                                           " Předplatné bude na konci platebního období automaticky obnoveno."
                                                           " Předplatné vyprší na konci platebního období.")])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " ve " [:b tier " předplatném"] " z " name "."])
     :payments/free-tier-info                         [:<> "OrgPad používáte v " [:b "předplatném zdarma"] "."]
     :payments/no-teams                               "Týmy nejsou dostupné v předplatném zdarma."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "Pro " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "povýšení"] " nebo "])
                                                         [:a.link-button {:href period-url} "změnu platebního období"]
                                                         " nás prosím kontaktujte."])
     :payments/choose-plan                            "Vybrat předplatné"
     :payments/manage-plan                            "Spravovat předplatné"
     :payments/contact-to-manage                      [:<> "Pro správu Vašeho předplatného nás prosím kontaktujte na "
                                                       [:a {:href  "mailto:support@orgpad.com"
                                                            :class "link-button"} "support@orgpad.com"] "."]
     :payments/receipts                               "Účty:"
     :payments/receipt-label                          "Účet {receipt/date-range}"
     :payments/customer-portal-failed                 "Při nahrávání webové stránky správy předplatného nastala chyba."

     :pending-activation/email-already-used           "E-mail je již použitý na jiném účtu."
     :pending-activation/email-not-recieved           "E-mail Vám nepřišel? Pošlete si ho znovu nebo změňte adresu níže."
     :pending-activation/email-sent                   "Aktivační e-mail odeslán. "
     :pending-activation/instructions                 "Už jste skoro u cíle! Aktivujte si svůj účet jedním kliknutím na odkaz, který jsme Vám zaslali na Váš e-mail."
     :pending-activation/resend                       "Znovu zaslat aktivační e-mail"

     :permission/admin                                "Může sdílet a mazat"
     :permission/admin-tooltip                        "Může měnit, kdo bude mít přístup k OrgStránce, nebo ji celou smazat."
     :permission/edit                                 "Může upravovat"
     :permission/edit-tooltip                         "Může dělat jakékoliv úpravy v OrgStránce."
     :permission/comment                              "Může komentovat"
     :permission/comment-tooltip                      (str "Může vytvářet, upravovat a propojovat vlastní buňky. "
                                                           "Nemůže ale upravovat zbytek OrgStránky.")
     :permission/view                                 "Může číst"
     :permission/view-tooltip                         "Může OrgStránku číst, ale nemůže dělat žádné změny."

     :presentation/presentation                       "Prezentace"
     :presentation/step                               "Krok"
     :presentation/first-step                         "První krok"
     :presentation/previous-step                      "Předchozí krok"
     :presentation/next-step                          "Další krok"
     :presentation/last-step                          "Poslední krok"
     :presentation/present                            "Začít prezentaci"
     :presentation/slideshow                          "Automaticky přehrávat kroky"
     :presentation/step-duration                      "Délka kroku v sekundách"
     :presentation/loop-slideshow                     "Opakovat na konci"
     :presentation/stop-slideshow                     "Zastavit automatické přehrávání kroků"
     :presentation/exit-tooltip                       "Ukončit prezentaci"

     :presentation/share-presentation                 "Sdílejte tuto prezentaci s ostatními."

     :presentation/embedded-zoom-info                 "CTRL + posouvání pro přiblížení"

     :paths-menu/focus                                "Nastavení kamery {keyboard/shortcut}"
     :paths-menu/open-and-close                       "Otevírání a zavírání buněk {keyboard/shortcut}"
     :paths-menu/visibility                           "Změna viditelnosti {keyboard/shortcut}"

     :pricing-popup/orgpages-exceeded-title           "Nemůžete vytvořit další OrgStránky v předplatném zdarma."
     :pricing-popup/orgpages-exceeded                 "Musíte povýšit Vaše předplatné."
     :pricing-popup/storage-exceeded-title            "Nedostatek místa pro nahrání {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Zbývá pouze " [:b space-left " místa"] " ve Vašem úložišti."
                                                         " Povýšením Vašeho předplatného můžete úložný prostor rozšířit."])
     :pricing-popup/num-shared-limit-reached-title    "Nemůžete sdílet tuto OrgStránku s více lidmi."
     :pricing-popup/num-shared-limit-reached-common   "Maximální počet lidí sdílejících tuto OrgStránku byl dosažen."
     :pricing-popup/num-shared-limit-reached          [:<> " K přidání více lidí musíte povýšit na "
                                                       [:b "profesionální předplatné"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " Vlastník této OrgStránky " owner " musí pro přidání dalších lidí povýšit na "
                                                         [:b "profesionální předplatné"] "."])
     :pricing-popup/enable-teams-title                "Povyšte Vaše předplatné pro správu týmů."
     :pricing-popup/enable-teams                      [:<> "Týmy seskupují lidi dohromady, což zjednodušuje spolupráci a sdílení OrgStránek."
                                                       " Tato funkcionalita je dostupná ve " [:b "standardním předplatném"] " nebo vyšším."]
     :pricing-popup/teams-limit-reached-title         "Povyšte Vaše předplatné pro vytváření více týmů."
     :pricing-popup/teams-limit-reached               "Limit pro počet týmů byl dosažen ve Vašem předplatném."
     :pricing-popup/team-members-limit-reached-title  "Nemůžete přidat více členů do {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "Maximální počet členů týmů byl dosažen."
     :pricing-popup/team-members-limit-reached        [:<> " Pro přidání více členů musíte povýšit na "
                                                       [:b "profesionální předplatné"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> "Vlastník tohoto týmu " owner " musí pro přidání dalších členů povýšit na "
                                                         [:b "profesionální předplatné"] "."])
     :pricing-popup/try-out-share-title               "Pro sdílení této OrgStránky se zaregistrujte"
     :pricing-popup/try-out-storage-exceeded          (fn [{:upload/keys [space-left]}]
                                                        [:<> "Ve vašem úložišti z " [:b space-left " remain"] " in your storage."])
     :pricing-popup/free-account-info                 "S registrací účtu zdarma dostanete:"
     :pricing-popup/free-limit                        "až tři OrgStránky,"
     :pricing-popup/free-storage                      "až 100MB úložiště,"
     :pricing-popup/free-share                        "sdílení vaší práce s ostatními."
     :pricing-popup/free-account-info2                "Vytvořte si svůj účet jen na několik kliknutí."

     :profile/open-contact-dialog                     "Poslat zprávu"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Kontaktujte " first-name " " last-name)
                                                          "Kontaktujte tohoto člověka"))
     :profile/contact-dialog-info                     (str "Protože nesdělujeme e-mailové adresy ostatních lidí v OrgPadu, odešleme tuto zprávu za Vás. Uvedeme v ní Vaše jméno a e-mail,"
                                                           " abychom Vám umožnili navázat přímý kontakt.")

     :promotion/unknown                               "Neznámý kód"
     :promotion/max-usages-reached                    "Použit příliš mnohokrát"
     :promotion/expired                               "Vypršel"
     :promotion/one-year-free                         "1 rok zdarma"
     :promotion/duration-free                         [:i18n/plural "{promotion/duration} {promotion/days} zdarma"
                                                       {:promotion/days [:promotion/duration "dnů" "den" "dny" "dnů"]}]
     :promotion/for-one-year                          " na 1 rok"
     :promotion/for-six-months                        " na 6 měsíců"

     :props/h1                                        "Velký nadpis"
     :props/h2                                        "Střední nadpis"
     :props/h3                                        "Malý nadpis"
     :props/weight-none                               "Normální spoj"
     :props/strong                                    "Silný spoj"
     :props/arrowhead-none                            "Bez šipky"
     :props/single                                    "Šipka"
     :props/double                                    "Dvojitá šipka"

     :public-permission/none                          "soukromá."
     :public-permission/comment                       "sdílená s každým pro komentování."
     :public-permission/edit                          "sdílená s každým pro úpravy."
     :public-permission/view                          "sdílená s každým pro čtení."

     :registration/create-user                        "Vytvořit účet"
     :registration/go-to-login                        (fn [{:login/keys [route]}]
                                                        [:<> "Už máte účet? " [:a.link-button {:href route} "Přihlaste se"]])
     :registration/options                            "Vyberte si jiný způsob registrace"
     :registration/server-error                       "Chyba serveru. Zkuste vytvořit účet znovu."
     :registration/missing-oauth-email                "{registration/service} nám nesdělil Váš e-mail. Vyplňte ho prosím níže."

     :search/previous-match                           "Předchozí výskyt (Page Up)"
     :search/next-match                               "Následující výskyt (Page Down)"
     :search/close                                    "Zavřít (ESC)"

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Změnit styl výběru "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; podržte SHIFT pro změnu na aktuální styl, podržte CTRL pro kopírování do aktuálního stylu"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "buněk" "buňky" "buněk"]
                                                                   :link-label [:selection/num-links
                                                                                "spojů" "spoje" "spojů"]}]

     :selection/link                                  "Propojit buňky"
     :selection/hide-contents                         "Schovat obsahy"
     :selection/show-contents                         "Zobrazit obsahy"
     :selection/move-to-new-orgpage                   "Přesunout do nové OrgStránky"
     :selection/copy-units-links                      "Zkopírovat buňky a spoje do schránky"
     :selection/flip-links                            "Změnit směry spojů"
     :selection/delete                                "Vymazat vybrané"

     :settings/profile                                "Profil"
     :settings/payments                               "Platby"
     :settings/account                                "Účet"
     :settings/linked-accounts                        "Propojené účty"
     :settings/notifications                          "Oznámení"
     :settings/account-description                    "Změňte svůj e-mail, heslo nebo smažte svůj účet."
     :settings/stats-description                      "Zde jsou vybrané statistiky Vašeho užívání OrgPadu."
     :settings/change-email                           "Změnit e-mail"
     :settings/change-email-text                      "Vložte novou e-mailovou adresu. Z bezpečnostních důvodů ji musíme ověřit před odblokováním účtu."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Váš účet je registrovaný na e-mail " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Váš účet je" [:b " propojený "] " s Facebookem."]
     :settings/account-not-linked-to-facebook         [:<> "Váš účet " [:b " není propojený "] " s Facebookem."]
     :settings/link-fb                                "Propojit s Facebookem"
     :settings/unlink-fb                              "Zrušit propojení s Facebookem"
     :settings/account-linked-to-google               [:<> "Váš účet je " [:b " propojený "] " s Googlem."]
     :settings/account-not-linked-to-google           [:<> "Váš účet " [:b " není propojený "] " s Googlem."]
     :settings/link-google                            "Propojit s Googlem"
     :settings/unlink-google                          "Zrušit propojení s Googlem"
     :settings/account-linked-to-microsoft            [:<> "Váš účet je " [:b " propojený "] " s Microsoftem."]
     :settings/account-not-linked-to-microsoft        [:<> "Váš účet " [:b " není propojený "] " s Microsoftem."]
     :settings/link-microsoft                         "Propojit s Microsoftem"
     :settings/unlink-microsoft                       "Zrušit propojení s Microsoftem"
     :settings/set-password-text                      " Nastavte heslo před zrušením propojení."
     :settings/linked-accounts-info                   "Propojte svůj účet na Facebooku nebo na Googlu s OrgPadem, abyste ho mohli využít k přihlášení."
     :settings/profile-info                           "Pomocí zadaných informací Vás spolupracující na společných projektech snadněji naleznou."
     :settings/select-language                        "Jazyk aplikace (CTRL+SHIFT+L): "

     :settings/delete-account                         "Smazat účet"
     :settings/confirm-delete-account-question        [:<> [:b "Trvale"] " smazat účet?"]
     :settings/confirm-delete-account-info            "Trvale smaže všechny Vaše OrgStránky a jejich data."
     :settings/delete-account-info                    [:<> "Smazání účtu " [:b "trvale"] " smaže všechny Vaše OrgStránky a jejich data."]

     :share-orgpage/campaigns                         "Kampaně"
     :share-orgpage/copied-to-clipboard               "Zkopírováno do schránky"
     :share-orgpage/copy-template-link                "Kopírovat odkaz na šablonu"
     :share-orgpage/dialog-title                      "Sdílení {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "Lidé bez účtu na OrgPadu obdrží pozvánku s odkazem."
                                                                  " Po otevření odkazu mohou číst tuto OrgStránku. ")
                                                         "Pro snazší sdílení OrgStránek se skupinou lidí si můžete "
                                                         [:a.link-button create-team "vytvořit tým"] "."])
     :share-orgpage/invite-for-editing                "Pozvat pro úpravy"
     :share-orgpage/invite-for-viewing                "Pozvat pro čtení"
     :share-orgpage/invite-by-email                   "Chcete jej pozvat e-mailem v určitém jazyce?"
     :share-orgpage/show-profile                      "Ukázat profil"
     :share-orgpage/links                             "Odkazy"
     :share-orgpage/to-read                           "číst"
     :share-orgpage/to-comment                        "komentovat"
     :share-orgpage/to-edit                           "upravit"
     :share-orgpage/links-tooltip                     "Udělte přístup prostřednictvím odkazů ke sdílení"
     :share-orgpage/template                          "Šablona"
     :share-orgpage/template-tooltip                  "Odkazy, které automaticky vytvoří kopii této OrgStránky"
     :share-orgpage/template-info                     "Lidé mohou využít tento odkaz k vytvoření vlastních kopií této OrgStránky."
     :share-orgpage/template-autoshare-none           "Nesdílet kopie se mnou."
     :share-orgpage/template-autoshare                (fn [{:share-orgpage/keys [template-autoshare]}]
                                                        (str "Sdílet kopie se mnou pro "
                                                             (case template-autoshare
                                                               :permission/view "čtení"
                                                               :permission/comment "komentování"
                                                               :permission/edit "editování") "."))
     :share-orgpage/embed                             "Vložit"
     :share-orgpage/embed-into-microsoft-teams        "Vložit do Microsoft Teams"
     :share-orgpage/embed-into-website                "Vložit do webové stránky nebo aplikace"
     :share-orgpage/embed-tooltip                     "Vložte do webové stránky nebo aplikace"
     :share-orgpage/new-user-or-usergroup             "Jméno, e-mail nebo tým"
     :share-orgpage/link-permission-start             "Umožněte lidem"
     :share-orgpage/link-permission-end               "tuto OrgStránku."
     :share-orgpage/orgpage-info                      "Info"
     :share-orgpage/orgpage-info-tooltip              "Informace o vlastníkovi a jestli je OrgStránka zveřejněná"
     :share-orgpage/user-permission                   (fn [{:permissions/keys [user-permission]}]
                                                        (str "Tato OrgStránka je s Vámi sdílena pro "
                                                             (case user-permission
                                                               :permission/view "čtení"
                                                               :permission/comment "komentování"
                                                               :permission/edit "editování") "."))
     :share-orgpage/remove-yourself                   "Odebrat sebe"
     :share-orgpage/private-info                      "Přístup máte pouze Vy a lidé, se kterými jste OrgStránku sdíleli přímo nebo pomocí odkazu. Každý nově vytvořený dokument je soukromý."
     :share-orgpage/publish-for-commenting-info       "OrgStránka je veřejná. Každý na internetu ji může vyhledat a s účtem v OrgPadu komentovat."
     :share-orgpage/publish-for-editing-info          "OrgStránka je veřejná. Každý na internetu ji může vyhledat a upravovat."
     :share-orgpage/publish-for-reading-info          "OrgStránka je veřejná. Každý na internetu ji může vyhledat a číst. Změny můžete dělat pouze Vy nebo lidé, se kterými jste OrgStránku sdíleli pro úpravy."
     :share-orgpage/publish-permission-end            "Tato OrgStránka je "
     :share-orgpage/publish                           "Publikovat"
     :share-orgpage/publish-confirmation              "Každý bude schopný {orgpage/permission} tuto OrgStránku. Jste si jistý?"
     :share-orgpage/publish-tooltip                   "Udělte přístup každému"
     :share-orgpage/remove-user                       "Odebrat oprávnění"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "Pokud jste odkaz sdíleli omylem, můžete "
                                                         [:span.link-button reset-links "zneplatnit všechny předchozí odkazy"]
                                                         "."])
     :share-orgpage/shareable-link                    "Sdílitelný odkaz"
     :share-orgpage/start-with-presentation           "Začít s prezentací."
     :share-orgpage/template-link-switch              "Vytvořit odkaz na šablonu."
     :share-orgpage/user-not-registered               " ještě není registrovaný v OrgPadu."
     :share-orgpage/users                             "Lidé"
     :share-orgpage/users-tooltip                     "Umožněte přístup jednotlivým lidem"

     :side-panel/about                                "Úvodní stránka"
     :side-panel/files-and-images                     "Soubory a obrázky"
     :side-panel/paths                                "Prezentace"
     :side-panel/translate                            "Překlady"
     :side-panel/toggle-debug                         "Debugger"
     :side-panel/help                                 "Nápověda"
     :side-panel/home                                 "Hlavní stránka"
     :side-panel/import                               "Import"
     :side-panel/share                                "Sdílení"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "souborů" "soubor" "soubory" "souborů"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "obrázků" "obrázek" "obrázky" "obrázků"]}]
     :side-panel/num-paths                            [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 "cest" "cesta" "cesty" "cest"]}]

     :step/closed-pages                               "Zavřené stránky."
     :step/everything-closed                          "Všechno zavřené."
     :step/hidden-units                               "Skryté buňky"
     :step/nothing-changed                            "Žádné změny."
     :step/opened-pages                               "Otevřené stránky"
     :step/pages-shown-in-the-camera                  "Stránky zobrazené na kameře"
     :step/revealed-units                             "Odhalené buňky"
     :step/switched-pages                             "Přepnuté stránky"

     :style-select/set-comment                        "Změnit v komentářovou buňku s vaší profilovkou (CTRL+,)"
     :style-select/unset-comment                      "Změnit v normální buňku odebráním profilovky (CTRL+,)"

     :tag/public                                      "veřejné"

     :text-field/email                                "E-mail"
     :text-field/first-name                           "Křestní jméno"
     :text-field/last-name                            "Příjmení"
     :text-field/new-password                         "Nové heslo"
     :text-field/password                             "Heslo"
     :text-field/title                                "Nadpis"
     :text-field/content                              "Obsah"
     :text-field/name-or-email                        "Jméno nebo e-mail"
     :text-field/subject                              "Předmět"
     :text-field/message                              "Zpráva"
     :text-field/phone-number                         "Telefonní číslo"
     :text-field/width                                "Šířka"
     :text-field/height                               "Výška"

     :tier/free                                       "Zdarma"
     :tier/standard                                   "Standardní"
     :tier/professional                               "Profesionální"
     :tier/school                                     "Školní"
     :tier/enterprise                                 "Firemní" ; podnik?
     :tier/unlimited                                  "Neomezené"

     :translate/title                                 "Překlad OrgStránky {orgpage/title} do jiného jazyka"
     :translate/info                                  (str "Automaticky vytvoří Vámi vlastněnou kopii OrgStránky,"
                                                           " která bude přeložena ze zdrojového jazyka do cílového jazyka."
                                                           " Během minuty ji naleznete ve Vašem seznamu.")
     :translate/source-lang                           "Zdrojový jazyk"
     :translate/target-lang                           "Cílový jazyk"
     :translate/translate                             "Přeložit"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Překlad dostupný jako "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :usergroup-role/owner                            "Vlastník"
     :usergroup-role/admin                            "Správce"
     :usergroup-role/member                           "Člen"

     :unit-editor/add-page                            "Vytvořit další stránku"
     :unit-editor/delete-page                         "Odstranit tuto stránku"
     :unit-editor/previous-page                       "Předchozí stránka (PAGEUP); podržte SHIFT pro přesunutí této stránky doleva (SHIFT+PAGEUP)"
     :unit-editor/next-page                           "Následující stránka (PAGEDOWN); podržte SHIFT pro přesunutí této stránky doprava (SHIFT+PAGEDOWN)"
     :unit-editor/switch-to-this-page                 (fn [{:render/keys [can-edit]}]
                                                        (str "Přepnout na tuto stránku"
                                                             (when can-edit "; podržte SHIFT pro přesunutí aktuální stránky sem")))
     :unit-editor/hidden-info                         "Pro psaní klikněte"
     :unit-editor/undo                                "Vrátit zpět (CTRL+Z)"
     :unit-editor/redo                                "Opakovat (CTRL+SHIFT+Z nebo CTRL+Y)"
     :unit-editor/toggle-bold                         "Tučné (CTRL+B)"
     :unit-editor/toggle-italic                       "Kurzíva (CTRL+I)"
     :unit-editor/toggle-strikethrough                "Přeškrtnutí"
     :unit-editor/toggle-subscript                    "Dolní index (CTRL+S)"
     :unit-editor/toggle-superscript                  "Horní index (CTRL+SHIFT+S)"
     :unit-editor/create-hyperlink                    "Vytvořit odkaz (CTRL+K)"
     :unit-editor/remove-hyperlink                    "Odstranit odkaz"
     :unit-editor/set-highlighting                    "Barva zvýraznění"
     :unit-editor/selection->code                     "Převést na kód (CTRL+D)"
     :unit-editor/toggle-list-ul                      "Odrážkový seznam (CTRL+U)"
     :unit-editor/toggle-list-ol                      "Číslovaný seznam (CTRL+O)"
     :unit-editor/indent                              "Zvětšit odsazení (TAB)"
     :unit-editor/outdent                             "Zmenšit odsazení (SHIFT+TAB)"
     :unit-editor/center                              "Zarovnání na střed"
     :unit-editor/heading                             "Nadpis"
     :unit-editor/embed-pdf                           "Zobrazit obsah PDF"
     :unit-editor/link-pdf                            "Nahradit obsah PDF odkazem"
     :unit-editor/embed-video                         "Zobrazit přehrávač videa"
     :unit-editor/link-video                          "Nahradit přehrávač videa odkazem"
     :unit-editor/embed-audio                         "Zobrazit přehrávač zvuku"
     :unit-editor/link-audio                          "Nahradit přehrávač zvuku odkazem"
     :unit-editor/hyperlink->embed                    "Zobrazit odkazovanou webovou stránku"
     :unit-editor/embed->hyperlink                    "Nahradit vloženou webovou stránku odkazem"
     :unit-editor/toggle-controls                     "Zobrazit ovládací prvky video přehrávače"
     :unit-editor/toggle-autoplay                     "Přehrávat automaticky"
     :unit-editor/toggle-muted                        "Přehrávat bez zvuku, jinak nemusí fungovat automatické přehrávání"
     :unit-editor/toggle-loop                         "Přehrávat ve smyčce"
     :unit-editor/toggle-chained-size                 "Zachovat poměr stran"
     :unit-editor/insert-menu                         "Vložit"
     :unit-editor/insert-image                        "Obrázek"
     :unit-editor/insert-image-shortcut               "CTRL+SHIFT+I"
     :unit-editor/insert-image-info                   "Nahrajte obrázek z Vašeho zařízení."
     :unit-editor/insert-image-info2                  "Tip: Přetáhněte nebo vložte obrázek přímo do buňky nebo do šedého plátna."
     :unit-editor/insert-camera                       "Kamera"
     :unit-editor/insert-attachment                   "Soubor"
     :unit-editor/insert-attachment-shortcut          "CTRL+SHIFT+F"
     :unit-editor/insert-video                        "Video"
     :unit-editor/insert-video-info                   "Nahrajte video z počítače nebo ho vložte z YouTube."
     :unit-editor/insert-video-info2                  "Tip: Přetáhněte videa a náhledy YouTube videí přímo do buňky nebo šedého plátna."
     :unit-editor/video-url                           "Odkaz na YouTube"
     :unit-editor/youtube-start                       "Start"
     :unit-editor/youtube-end                         "Konec"
     :unit-editor/insert-table                        "Tabulka"
     :unit-editor/insert-table-info                   "Zvolte velikost vkládané tabulky."
     :unit-editor/toggle-table-border                 "Zobrazit ohraničení tabulky"
     :unit-editor/add-row-before                      "Vložit řádek nad"
     :unit-editor/add-row-after                       "Vložit řádek pod"
     :unit-editor/remove-current-row                  "Smazat řádek"
     :unit-editor/add-column-before                   "Vložit sloupec před"
     :unit-editor/add-column-after                    "Vložit sloupec za"
     :unit-editor/remove-current-column               "Smazat sloupec"
     :unit-editor/remove-table                        "Odstranit tabulku"
     :unit-editor/insert-website                      "Webová stránka"
     :unit-editor/insert-website-info                 (str "Webovou stránku můžete vložit přímo do buňky."
                                                           " Pokud to nefunguje, je možné, že je to zakázané majitelem webové stránky.")
     :unit-editor/website-url-or-code                 "Adresa webové stránky nebo kód"
     :unit-editor/update-website                      "Změnit adresu webové stránky"
     :unit-editor/insert-orgpage                      "OrgStránka"
     :unit-editor/insert-code                         "Kód"
     :unit-editor/insert-code-shortcut                "CTRL+D"
     :unit-editor/toggle-block-code                   "Kód ve bloku"
     :unit-editor/remove-code                         "Odstranit formátování kódu"

     :unit-panel/link                                 (str "Pro propojení klikněte nebo táhněte;"
                                                           " podržte SHIFT pro vytvoření více spojů;"
                                                           " podržte CTRL pro vytvoření řetězu buněk")
     :unit-panel/upload-attachment                    "Vložte obrázek nebo soubor do této buňky"
     :unit-panel/change-link-style                    (str "Změna stylu této buňky; "
                                                           "podržte SHIFT pro nastavení aktuálního stylu, "
                                                           "podržte CTRL pro zkopírování do aktuálního stylu; "
                                                           "táhnutím vyrobit propojení v tomto stylu")
     :unit-panel/hide-content                         "Skrýt obsah"
     :unit-panel/delete-unit                          "Smazat buňku"

     :usergroups/create-team                          "Vytvořit tým"
     :usergroups/info                                 "Pro snazší sdílení OrgStránek vytvářejte a spravujte týmy Vašich přátel a spolupracovníků."
     :usergroups/delete-usergroup                     "Smazat tým"
     :usergroups/members                              "Členové"
     :usergroups/change                               "Změnit logo a název týmu"
     :usergroups/show-actions                         "Ukázat akce"
     :usergroups/name                                 "Jméno"
     :usergroups/create-usegroup-info                 "Jméno a profilový obrázek týmu jsou viditelné pro všechny lidi na OrgPadu."
     :usergroups/confirm-delete-usergroup             [:<> [:b "Trvale"] " smazat tento tým?"]
     :usergroups/usergroups-members                   "Členové týmu {usergroup/name}"
     :usergroups/remove-member                        "Odebrat z týmu"
     :usergroups/remove-admin                         "Odebrat správce"
     :usergroups/make-admin                           "Udělat správcem"
     :usergroups/admin-tooltip                        "Správce může spravovat členy a smazat tým."

     :wire-transfer/title                             "Bankovní převod pro roční {wire-transfer/tier} předplatné"
     :wire-transfer/info                              "Vaše roční předplatné aktivujeme po přijetí peněz na náš účet."
     :wire-transfer/used-currency                     "Platba v {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Příjemce"
     :wire-transfer/account-number                    "Číslo účtu"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Částka"
     :wire-transfer/payment-purpose                   "Zpráva pro příjemce"
     :wire-transfer/qr-code-common                    (str "Pro automatické vyplnění správných informací pomoci bankovní"
                                                           " aplikace prosím naskenujte následující kód QR platby.")
     :wire-transfer/cz-sk-qr-code-description         (str " Tento QR kód se běžně používá pro bankovní převody"
                                                           " v Česku a na Slovensku.")
     :wire-transfer/eu-qr-code-description            (str " Tento QR kód se běžně používá pro SEPA bankovní převody"
                                                           " v Evropské unii.")
     :wire-transfer/trial-info                        (str "Pro plné využití OrgPadu můžete začít ihned jednorázovým"
                                                           " 7denním předplatným. Až nám banka potvrdí platbu,"
                                                           " prodloužíme Vám předplatné o 1 rok.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " Pokud máte jakékoliv dotazy nebo těžkosti, prosím kontaktujte"
                                                         " nás " [:a.link-button {:href url} "vyplněním formuláře"] "."])
     :wire-transfer/success-text                      [:<> "Aktivovali jsme Vám " [:b "jednorázové 7denní předplatné"] ","
                                                       " abyste mohli OrgPad s novým plánem používat okamžitě. "]
     :wire-transfer/common-result-text                (str "Když banka potvrdí, že platba proběhla úspěšně,"
                                                           " bude doba předplatného prodloužena o 1 rok.")
     :wire-transfer/start-trial                       "Platba odeslána"
     :wire-transfer/start-trial-result-title          "Děkujeme za platbu"
     :wire-transfer/copy                              "Zkopírovat do schránky"

     :youtube-placement/watch-on-prefix               (str "Sledujte" unicode/nbsp "na")
     :youtube-placement/watch-on-suffix               ""
     }))
