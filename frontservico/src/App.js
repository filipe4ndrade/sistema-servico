import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className ="container">
      <h1>Cadastro de Serviços</h1>
      <form>
        <div className="col-6">
          <div>
              <label className="form-label">Nome do Cliente</label>
              <input name="nomeCliente" type="text" className="form-control"/>
          </div>
          <div>
              <label className="form-label">Data de Início</label>
              <input name="dataInicio" type="date" className="form-control"/>
          </div>
          <div>
              <label className="form-label">Data de Término</label>
              <input name="dataTermino" type="data" className="form-control"/>
          </div>
          <div>
              <label className="form-label">Descrição do Serviço</label>
              <input name="descricaoServico" type="text" className="form-control"/>
          </div>
          <div>
              <label className="form-label">Valor Pago</label>
              <input name="valorPago" type="number" className="form-control"/>
          </div>
          <div>
              <label className="form-label">Data de Pagamento</label>
              <input name="dataPagamento" type="date" className="form-control"/>
          </div>
        </div>
      </form>
    </div>
  );
}

export default App;
