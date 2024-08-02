package org.codeforegypt.calculaterpro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import org.codeforegypt.calculaterpro.ui.theme.LightGray
import org.codeforegypt.calculaterpro.ui.theme.MediumGray
import org.codeforegypt.calculaterpro.ui.theme.Orange


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpace: Dp = 8.dp,
    modifier: Modifier =Modifier,
    onAction: (CalculatorAction) -> Unit
) {
    Box (
        modifier = modifier
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpace)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f)
                ) {
                    onAction(CalculatorAction.Clear)
                }
                CalculatorButton(
                    symbol = "Del",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Delete)
                }
                CalculatorButton(
                    symbol = "/",
                    color = Orange,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    symbol = "7",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(7))
                }
                CalculatorButton(
                    symbol = "8",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(8))
                }
                CalculatorButton(
                    symbol = "9",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(9))
                }
                CalculatorButton(
                    symbol = "x",
                    color = Orange,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    symbol = "4",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(4))
                }
                CalculatorButton(
                    symbol = "5",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                   onAction(CalculatorAction.Number(5))
                }
                CalculatorButton(
                    symbol = "6",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(6))
                }
                CalculatorButton(
                    symbol = "-",
                    color = Orange,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    symbol = "1",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(1))
                }
                CalculatorButton(
                    symbol = "2",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(2))
                }
                CalculatorButton(
                    symbol = "3",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Number(3))
                }
                CalculatorButton(
                    symbol = "+",
                    color = Orange,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    symbol = "0",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f)
                ) {
                    onAction(CalculatorAction.Number(0))
                }
                CalculatorButton(
                    symbol = ".",
                    color = MediumGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Decimal)
                }
                CalculatorButton(
                    symbol = "=",
                    color = Orange,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
                    onAction(CalculatorAction.Calculate)
                }
            }
        }
    }
}