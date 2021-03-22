/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.validation.CPFValidator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author alanm
 */
public class UtilServices {
    
    public static boolean isValidPassword(String password, String confirmPassword)
    {
        return password.equals(confirmPassword);        
    }
    
    public static boolean isValidCPF(String cpf)
    {
        CPFValidator cpfValidator = new CPFValidator();
        List<ValidationMessage> erros = cpfValidator.invalidMessagesFor(cpf); 
        
        return (erros.size() > 0);
    }
    
    public static boolean isValidEmail(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }
    
    public static boolean isValidDate(String date) 
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("dd/MM/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date2 = LocalDate.parse(date, dateTimeFormatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        } 
    }
    
    public static String deformCPF(String cpf)
    {
        String fCPF="";
        CPFFormatter formatter = new CPFFormatter();
        
        if(formatter.isFormatted(cpf))
            fCPF = formatter.unformat(cpf);
        else
            fCPF=cpf;
        
        return fCPF;
    }
    
    public static void loadCombo(JComboBox jcombo,Object[] values ){
        //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        
        jcombo.setModel(comboModel);
        //removendo todos os elementos do combo
        jcombo.removeAllItems();
        //cria a lista: java.util.List
        //jcombo.addItem("-- Selecione --");
        //percorrendo a lista para inserir os valores no combo
        for (Object value : values) {
            //adicionando a categoria no combo
            jcombo.addItem(value);
        }
    }
}
