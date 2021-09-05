﻿/*
 Copyright (c) 2003-2013, CKSource - Frederico Knabben. All rights reserved.
 For licensing, see LICENSE.html or http://ckeditor.com/license
*/
CKEDITOR.plugins.setLang("a11yhelp", "el", {
    title: "Οδηγίες Προσβασιμότητας", contents: "Περιεχόμενα Βοήθειας. Πατήστε ESC για κλείσιμο.", legend: [{
        name: "Γενικά",
        items: [{
            name: "Εργαλειοθήκη Επεξεργαστή",
            legend: "Πατήστε ${toolbarFocus} για να περιηγηθείτε στην γραμμή εργαλείων. Μετακινηθείτε ανάμεσα στις ομάδες της γραμμής εργαλείων με TAB και Shift-TAB. Μετακινηθείτε ανάμεσα στα κουμπία εργαλείων με ΔΕΞΙ και ΑΡΙΣΤΕΡΟ ΒΕΛΑΚΙ. Πατήστε ΚΕΝΟ ή ENTER για να ενεργοποιήσετε το ενεργό κουμπί εργαλείου."
        }, {
            name: "Παράθυρο Διαλόγου Επεξεργαστή",
            legend: "Μέσα σε ένα παράθυρο διαλόγου, πατήστε TAB για να μεταβείτε στο επόμενο πεδίο ή SHIFT + TAB για να μεταβείτε στο προηγούμενο. Πατήστε ENTER για να υποβάλετε την φόρμα. Πατήστε ESC για να ακυρώσετε την διαδικασία της φόρμας. Για παράθυρα διαλόγων που έχουν πολλές σελίδες σε καρτέλες πατήστε ALT + F10 για να μεταβείτε στην λίστα των καρτέλων. Στην συνέχεια μπορείτε να μεταβείτε στην επόμενη καρτέλα πατώντας TAB ή RIGHT ARROW. Μπορείτε να μεταβείτε στην προηγούμενη καρτέλα πατώντας SHIFT + TAB ή LEFT ARROW. Πατήστε SPACE ή ENTER για να επιλέξετε την καρτέλα για προβολή."
        },
            {
                name: "Αναδυόμενο Μενού Επεξεργαστή",
                legend: "Πατήστε ${contextMenu} ή APPLICATION KEY για να ανοίξετε το αναδυόμενο μενού. Μετά μετακινηθείτε στην επόμενη επιλογή του μενού με  TAB ή ΚΑΤΩ ΒΕΛΑΚΙ. Μετακινηθείτε στην προηγούμενη επιλογή με SHIFT+TAB ή ΠΑΝΩ ΒΕΛΑΚΙ. Πατήστε ΔΙΑΣΤΗΜΑ ή ENTER για να επιλέξετε το τρέχων στοιχείο. Ανοίξτε το αναδυόμενο μενού της τρέχουσας επιλογής με ΔΙΑΣΤΗΜΑ ή ENTER ή ΔΕΞΙ ΒΕΛΑΚΙ. Μεταβείτε πίσω στο αρχικό στοιχείο μενού με ESC ή ΑΡΙΣΤΕΡΟ ΒΕΛΑΚΙ. Κλείστε το αναδυόμενο μενού με ESC."
            },
            {
                name: "Κουτί Λίστας Επεξεργαστών",
                legend: "Μέσα σε ένα κουτί λίστας, μετακινηθείτε στο επόμενο στοιχείο με TAB ή ΚΑΤΩ ΒΕΛΑΚΙ. Μετακινηθείτε στο προηγούμενο στοιχείο με SHIFT + TAB ή ΠΑΝΩ ΒΕΛΑΚΙ. Πατήστε ΔΙΑΣΤΗΜΑ ή ENTER για να επιλέξετε ένα στοιχείο. Πατήστε ESC για να κλείσετε το κουτί της λίστας."
            }, {
                name: "Μπάρα Διαδρομών Στοιχείων Επεξεργαστή",
                legend: "Πατήστε ${elementsPathFocus} για να περιηγηθείτε στην μπάρα διαδρομών στοιχείων του επεξεργαστή. Μετακινηθείτε στο κουμπί του επόμενου στοιχείου με το TAB ή το ΔΕΞΙ ΒΕΛΑΚΙ. Μετακινηθείτε στο κουμπί του προηγούμενου στοιχείου με το SHIFT+TAB ή το ΑΡΙΣΤΕΡΟ ΒΕΛΑΚΙ. Πατήστε ΔΙΑΣΤΗΜΑ ή ENTER για να επιλέξετε το στοιχείο στον επεξεργαστή."
            }]
    },
        {
            name: "Εντολές",
            items: [{name: " Εντολή αναίρεσης", legend: "Πατήστε ${undo}"}, {
                name: " Εντολή επανάληψης",
                legend: "Πατήστε ${redo}"
            }, {name: " Εντολή έντονης γραφής", legend: "Πατήστε ${bold}"}, {
                name: " Εντολή πλάγιας γραφής",
                legend: "Πατήστε ${italic}"
            }, {name: " Εντολή υπογράμμισης", legend: "Πατήστε ${underline}"}, {
                name: " Εντολή συνδέσμου",
                legend: "Πατήστε ${link}"
            }, {name: " Εντολή Σύμπτηξης Εργαλειοθήκης", legend: "Πατήστε ${toolbarCollapse}"}, {
                name: " Access previous focus space command",
                legend: "Press ${accessPreviousSpace} to access the closest unreachable focus space before the caret, for example: two adjacent HR elements. Repeat the key combination to reach distant focus spaces."
            },
                {
                    name: " Access next focus space command",
                    legend: "Press ${accessNextSpace} to access the closest unreachable focus space after the caret, for example: two adjacent HR elements. Repeat the key combination to reach distant focus spaces."
                }, {name: " Βοήθεια Προσβασιμότητας", legend: "Πατήστε ${a11yHelp}"}]
        }]
});