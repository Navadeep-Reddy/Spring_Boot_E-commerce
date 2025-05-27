import { JSX } from "react";

function Home(props: any): JSX.Element {
  const boxes: number[] = props.array;

  return (
    <div className="h-screen pt-[5%]">
      <div className="grid grid-cols-3 gap-4 mx-[10%]">
        {boxes.map((box: number, index: number) => {
          return (
            <div key={index} className="box-item p-4 bg-tertiary">
              ProductId: {box}
            </div>
          );
        })}
      </div>
    </div>
  );
}

export default Home;
