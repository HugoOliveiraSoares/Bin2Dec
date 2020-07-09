function validate_input(bin)
{
    let flag = 1;

    for (let aux = 0; aux < bin.length; aux++) {
        if (bin[aux] != "1" && bin[aux] != "0") 
            flag = 0;
    }

    return flag;
}

function bin2dec(bin)
{
    var decimal = 0;
    for (let aux = bin.length - 1; aux >= 0; aux--)
    {
        decimal += parseInt(bin[aux]) * Math.pow(2, bin.length - 1 - aux);
    }

    return decimal;
}

function main()
{
    var numero_binario = document.getElementById('txtn')
    var convertido = document.getElementById('decimalout')
    numero_binario.style.borderStyle = "none"

    
    if (numero_binario.value == "")
    {
        convertido.value = "Por favor digite um valor";
        numero_binario.style.borderStyle = "solid";
        numero_binario.style.borderColor = "#ff0000ca";
    } else if (validate_input(numero_binario.value))
    {
        convertido.value = bin2dec(numero_binario.value);
    } else
    {
        convertido.value = "Digite somente 0's e 1's";
        numero_binario.style.borderStyle = "solid";
        numero_binario.style.borderColor = "#ff0000ca";
    }
}